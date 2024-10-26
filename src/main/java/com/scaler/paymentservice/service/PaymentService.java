package com.scaler.paymentservice.service;

import com.stripe.exception.StripeException;

public interface PaymentService {
    public String createPaymentLink(Long orderId) throws StripeException;
}
