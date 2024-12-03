package com.destaxa.core.service;

import com.destaxa.core.domain.PaymentRequest;
import com.destaxa.core.domain.PaymentResponse;
import com.destaxa.core.port.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentProcessor paymentProcessor;

    @Autowired
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public PaymentResponse processPayment(PaymentRequest request) {
        return paymentProcessor.processPayment(request);
    }

}