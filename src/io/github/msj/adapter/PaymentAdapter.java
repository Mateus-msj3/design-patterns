package io.github.msj.adapter;

import io.github.msj.adapter.adaptee.OldPaymentSystem;
import io.github.msj.adapter.target.PaymentGateway;

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
