package io.github.msj.creative.abstract_factory.products;

public class CarWheel implements Wheel {

    @Override
    public void rotate() {
        System.out.println("Car wheel is rotating");
    }

}
