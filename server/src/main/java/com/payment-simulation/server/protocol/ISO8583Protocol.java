package com.destaxa.server.protocol;

import com.destaxa.core.domain.PaymentRequest;
import com.destaxa.core.domain.PaymentResponse;
import org.springframework.stereotype.Component;

/**
 * Implementa o protocolo ISO8583 para simular a autorização de pagamento.
 */
@Component
public class ISO8583Protocol {

    /**
     * Processa uma solicitação de pagamento conforme o protocolo ISO8583.
     */
    public PaymentResponse processISO8583(PaymentRequest request) {
        PaymentResponse response = new PaymentResponse();

        if (request.getValue() > 1000) {
            response.setResponseCode("TIMEOUT");  // Simula timeout para valores > 1000
        } else if (request.getValue() > 0) {
            response.setResponseCode("000");  // Aprovação de transação positiva
        } else {
            response.setResponseCode("051");  // Negação para valores negativos
        }

        response.setPaymentId(request.getExternalId());
        response.setValue(request.getValue());
        response.setTransactionDate("24-11-18");  // Data simulada
        response.setTransactionHour("12:45:34");  // Hora simulada
        return response;
    }
}
