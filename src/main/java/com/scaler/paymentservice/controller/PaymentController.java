package com.scaler.paymentservice.controller;

import com.scaler.paymentservice.dtos.GeneratePaymentLinkRequestDto;
import com.scaler.paymentservice.service.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    PaymentService paymentService;

    PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping()
    public String generatePaymentLink(@RequestBody GeneratePaymentLinkRequestDto requestDto) throws StripeException {
        return paymentService.createPaymentLink(requestDto.getOrderId());
    }

    @PostMapping("/webhook")
    public void generateWebhook(){

    }
}
