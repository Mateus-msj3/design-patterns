package io.github.msj.creative.abstract_factory.products;

public class TruckWheel implements Wheel {

    @Override
    public void rotate() {
        System.out.println("Truck wheel is rotating");
    }

}
