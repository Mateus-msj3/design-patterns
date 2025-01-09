package io.github.msj.creative.abstract_factory.client;

import io.github.msj.creative.abstract_factory.products.Vehicle;
import io.github.msj.creative.abstract_factory.products.Wheel;
import io.github.msj.creative.abstract_factory.transports.TransportFactory;

public class TransportClient {

    private Vehicle vehicle;

    private Wheel wheel;

    // O cliente recebe a fábrica e cria os objetos
    public TransportClient(TransportFactory factory) {
        vehicle = factory.createVehicle();
        wheel = factory.createWheel();
    }

    public void operate() {
        vehicle.drive();
        wheel.rotate();
    }

}

