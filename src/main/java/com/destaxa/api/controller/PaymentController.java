package com.destaxa.api.controller;

import com.destaxa.core.domain.PaymentRequest;
import com.destaxa.core.domain.PaymentResponse;
import com.destaxa.core.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/authorization")
    public PaymentResponse authorizePayment(@RequestBody PaymentRequest paymentRequest) {
        //pula o socket
        return paymentService.processPayment(paymentRequest);
        //fluxo completo
        //return paymentService.processPaymentSocket(paymentRequest);
    }

}