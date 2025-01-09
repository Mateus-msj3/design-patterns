package io.github.msj.structural.adapter.client;

import io.github.msj.structural.adapter.target.PaymentGateway;

public class PaymentClient {

    private final PaymentGateway paymentGateway;

    public PaymentClient(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePayment(double amount) {
        paymentGateway.processPayment(amount);
    }
}

