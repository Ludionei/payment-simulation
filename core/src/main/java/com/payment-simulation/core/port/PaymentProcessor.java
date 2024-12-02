package com.destaxa.payment.core.port;

/**
 * Define o contrato de comunicação para o processador de pagamento.
 */
public interface PaymentProcessor {
    PaymentResponse processPayment(PaymentRequest request);
}
