package io.github.msj.structural.adapter;

import io.github.msj.structural.adapter.adaptee.OldPaymentSystem;
import io.github.msj.structural.adapter.target.PaymentGateway;

public class PaymentAdapter implements PaymentGateway {

    private final OldPaymentSystem oldPaymentSystem;

    public PaymentAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

    @Override
    public void processPayment(double amount) {
        oldPaymentSystem.makePayment(amount);
    }
}
