package com.destaxa.core.application;

import com.destaxa.core.domain.PaymentRequest;
import com.destaxa.core.domain.PaymentResponse;

public interface PaymentProcessor {
    public PaymentResponse processPayment(PaymentRequest request);
}