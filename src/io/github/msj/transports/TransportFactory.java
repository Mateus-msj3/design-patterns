package io.github.msj.transports;

import io.github.msj.products.Vehicle;
import io.github.msj.products.Wheel;

public interface TransportFactory {

    Vehicle createVehicle();

    Wheel createWheel();

}
