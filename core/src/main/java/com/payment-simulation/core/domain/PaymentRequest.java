package com.destaxa.payment.core.domain;

/**
 * Representa os dados de uma solicitação de pagamento.
 */
public class PaymentRequest {
    private String externalId;  // Identificador único da requisição
    private double value;  // Valor da transação
    private String cardNumber;  // Número do cartão
    private int installments;  // Número de parcelas
    private String cvv;  // Código de segurança do cartão
    private String expMonth;  // Mês de expiração
    private String expYear;  // Ano de expiração
    private String holderName;  // Nome do titular do cartão

    // Getters e setters omitidos para brevidade
}
