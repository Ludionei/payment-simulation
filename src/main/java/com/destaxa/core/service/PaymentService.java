package com.destaxa.core.service;

import com.destaxa.core.domain.PaymentRequest;
import com.destaxa.core.domain.PaymentResponse;
import com.destaxa.core.usecase.PaymentAuthorizer;
import com.destaxa.server.socket.PaymentServerSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentAuthorizer paymentAuthorizer;
    private final PaymentServerSocket paymentServerSocket;

    @Autowired
    public PaymentService(PaymentAuthorizer paymentAuthorizer, PaymentServerSocket paymentServerSocket) {
        this.paymentAuthorizer = paymentAuthorizer;
        this.paymentServerSocket = paymentServerSocket;
    }

    //fluxo completo
    public PaymentResponse processPaymentSocket(PaymentRequest request) {
        // Inicia o servidor socket (se ainda não estiver iniciado)
        paymentServerSocket.startServer();

        // **Enviar a requisição para o servidor socket**
        // Implementar a lógica para enviar a requisição ISO8583 para o servidor socket
        // ...

        // Receber a resposta do servidor socket
        // ...

        // Processar a resposta e retornar um objeto PaymentResponse
        return paymentAuthorizer.processPayment(request);
    }

    //pula o socket
    public PaymentResponse processPayment(PaymentRequest request) {
        return paymentAuthorizer.processPayment(request);
    }

}