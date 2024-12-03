package io.github.msj.abstract_factory.products;

public class Truck implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}
