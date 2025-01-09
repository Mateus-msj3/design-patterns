package io.github.msj.structural.adapter.adaptee;

public class OldPaymentSystemImpl implements OldPaymentSystem {

    @Override
    public void makePayment(double amount) {
        System.out.println("Making payment of $" + amount);
    }
}
