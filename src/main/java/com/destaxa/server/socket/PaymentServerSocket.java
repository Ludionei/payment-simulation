package com.destaxa.server.socket;

import com.destaxa.core.domain.PaymentRequest;
import com.destaxa.core.domain.PaymentResponse;
import com.destaxa.core.usecase.PaymentAuthorizer;
import com.destaxa.server.protocol.ISO8583Request0200;
import com.destaxa.server.protocol.ISO8583Response0210;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

@Component
public class PaymentServerSocket {

    private final PaymentAuthorizer protocol;

    @Autowired
    public PaymentServerSocket(PaymentAuthorizer protocol) {
        this.protocol = protocol;
    }

    /**
     * Inicia o servidor socket para receber as solicitações de pagamento no formato ISO8583.
     */
    public void startServer() {
        /*try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Servidor iniciado e aguardando conexões...");
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    ISO8583Request0200 request = new ISO8583Request0200();
                    request.read(clientSocket.getInputStream());

                    // Processar a requisição ISO8583
                    PaymentRequest paymentRequest = convertToPaymentRequest(request);
                    PaymentResponse paymentResponse = protocol.processPayment(paymentRequest);

                    // Construir a resposta ISO8583
                    ISO8583Response0210 response = new ISO8583Response0210(request);
                    // ... configurar a resposta com os dados de paymentResponse
                    response.write(clientSocket.getOutputStream());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    // Método auxiliar para converter uma requisição ISO8583 em um objeto PaymentRequest
    private PaymentRequest convertToPaymentRequest(ISO8583Request0200 request) {
        // Implementar a lógica para extrair os dados relevantes da mensagem ISO8583
        // e criar um objeto PaymentRequest
        PaymentRequest paymentRequest = new PaymentRequest();
        //paymentRequest.setValue(Double.parseDouble(request.getString(3)));
        // ... outros campos
        return paymentRequest;
    }
}