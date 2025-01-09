package io.github.msj.creative.abstract_factory.transports;

import io.github.msj.creative.abstract_factory.products.Car;
import io.github.msj.creative.abstract_factory.products.CarWheel;
import io.github.msj.creative.abstract_factory.products.Vehicle;
import io.github.msj.creative.abstract_factory.products.Wheel;

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
