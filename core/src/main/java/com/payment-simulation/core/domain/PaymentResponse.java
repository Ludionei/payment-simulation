package com.destaxa.payment.core.domain;

/**
 * Representa a resposta de uma transação de pagamento.
 */
public class PaymentResponse {
    private String paymentId;  // Identificador único da resposta
    private double value;  // Valor da transação
    private String responseCode;  // Código de resposta (000, 051, TIMEOUT)
    private String authorizationCode;  // Código de autorização
    private String transactionDate;  // Data da transação
    private String transactionHour;  // Hora da transação

    // Getters e setters omitidos para brevidade
}
