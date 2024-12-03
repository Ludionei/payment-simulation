package com.destaxa.server.socket;

import com.destaxa.core.domain.PaymentRequest;
import com.destaxa.core.domain.PaymentResponse;
import com.destaxa.core.usecase.PaymentAuthorizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Servidor que escuta requisições de pagamento via socket e processa conforme o protocolo ISO8583.
 */
@Component
public class PaymentServerSocket {

    private final PaymentAuthorizer protocol;

    @Autowired
    public PaymentServerSocket(PaymentAuthorizer protocol) {
        this.protocol = protocol;
    }

    /**
     * Inicia o servidor socket para receber as solicitações de pagamento.
     */
    public void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Servidor iniciado e aguardando conexões...");
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClientRequest(clientSocket);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleClientRequest(Socket clientSocket) throws IOException {
        InputStream inputStream = clientSocket.getInputStream();
        OutputStream outputStream = clientSocket.getOutputStream();

        // Leitura e interpretação da solicitação (aqui simulada como JSON)
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String requestLine = reader.readLine();  // Simulação da leitura do request
        PaymentRequest request = parsePaymentRequest(requestLine);

        // Processamento da solicitação
        PaymentResponse response = protocol.processPayment(request);

        // Envio da resposta
        PrintWriter writer = new PrintWriter(outputStream, true);
        writer.println(response.getResponseCode());
    }

    private PaymentRequest parsePaymentRequest(String requestLine) {
        // Método fictício para simular o parse da solicitação
        PaymentRequest request = new PaymentRequest();
        request.setExternalId("12345");
        request.setValue(100.0);
        return request;
    }

}