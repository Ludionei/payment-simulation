package com.destaxa.core.usecase;

import com.destaxa.core.domain.PaymentRequest;
import com.destaxa.core.domain.PaymentResponse;
import com.destaxa.server.exception.PaymentTimeoutException;
import com.destaxa.core.application.PaymentProcessor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Component
public class PaymentAuthorizer implements PaymentProcessor {

    @Override
    public PaymentResponse processPayment(PaymentRequest request) {

        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(UUID.randomUUID().toString());
        response.setValue(request.getValue());
        response.setTransactionDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy-MM-dd")));
        response.setTransactionHour(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        if (request.getValue() < 0) {
            response.setResponseCode("051(Negado)");
        } else if (request.getValue() > 1000) {
            response.setResponseCode("TIMEOUT");
            throw new PaymentTimeoutException("Timeout for high-value transactions");
        } else {
            response.setResponseCode("000(Aprovado)");
            response.setAuthorizationCode(UUID.randomUUID().toString().substring(0, 6));
        }

        return response;
    }
    
}