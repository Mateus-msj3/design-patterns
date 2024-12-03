package io.github.msj.abstract_factory.transports;

import io.github.msj.abstract_factory.products.Truck;
import io.github.msj.abstract_factory.products.TruckWheel;
import io.github.msj.abstract_factory.products.Vehicle;
import io.github.msj.abstract_factory.products.Wheel;

public class RuralTransportFactory implements TransportFactory {

    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }

    @Override
    public Wheel createWheel() {
        return new TruckWheel();
    }

}
