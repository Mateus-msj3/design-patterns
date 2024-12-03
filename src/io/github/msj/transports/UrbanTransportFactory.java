package io.github.msj.transports;

import io.github.msj.products.Car;
import io.github.msj.products.CarWheel;
import io.github.msj.products.Vehicle;
import io.github.msj.products.Wheel;

public class UrbanTransportFactory implements TransportFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Wheel createWheel() {
        return new CarWheel();
    }
}
