package com.ex.demo.service;

import com.ex.demo.dto.PaymentInfo;
import com.ex.demo.dto.Purchase;
import com.ex.demo.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;


public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}