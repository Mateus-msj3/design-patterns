package io.github.msj.client;

import io.github.msj.products.Vehicle;
import io.github.msj.products.Wheel;
import io.github.msj.transports.TransportFactory;

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

