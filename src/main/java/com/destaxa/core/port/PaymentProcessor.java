package com.destaxa.core.port;

import com.destaxa.core.domain.PaymentRequest;
import com.destaxa.core.domain.PaymentResponse;

public interface PaymentProcessor {
    public PaymentResponse processPayment(PaymentRequest request);
}