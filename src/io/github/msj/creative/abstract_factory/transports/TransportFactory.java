package io.github.msj.creative.abstract_factory.transports;

import io.github.msj.creative.abstract_factory.products.Vehicle;
import io.github.msj.creative.abstract_factory.products.Wheel;

public interface TransportFactory {

    Vehicle createVehicle();

    Wheel createWheel();

}
