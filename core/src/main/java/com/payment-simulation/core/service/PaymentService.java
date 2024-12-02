package com.destaxa.payment.core.service;

import com.destaxa.payment.core.domain.PaymentRequest;
import com.destaxa.payment.core.domain.PaymentResponse;
import com.destaxa.payment.core.port.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Serviço que utiliza o processador de pagamento para realizar a transação.
 */
@Service
public class PaymentService {

    private final PaymentProcessor paymentProcessor;

    @Autowired
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    /**
     * Processa uma solicitação de pagamento.
     */
    public PaymentResponse processPayment(PaymentRequest request) {
        return paymentProcessor.processPayment(request);
    }
}
