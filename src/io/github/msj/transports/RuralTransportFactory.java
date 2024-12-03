package io.github.msj.transports;

import io.github.msj.products.Truck;
import io.github.msj.products.TruckWheel;
import io.github.msj.products.Vehicle;
import io.github.msj.products.Wheel;

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
