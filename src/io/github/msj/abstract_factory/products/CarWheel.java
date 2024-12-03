package io.github.msj.abstract_factory.products;

public class CarWheel implements Wheel {

    @Override
    public void rotate() {
        System.out.println("Car wheel is rotating");
    }

}
