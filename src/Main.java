import io.github.msj.client.TransportClient;
import io.github.msj.transports.RuralTransportFactory;
import io.github.msj.transports.TransportFactory;
import io.github.msj.transports.UrbanTransportFactory;

public class Main {
    public static void main(String[] args) {

        // Criando um ambiente urbano
        TransportFactory urbanFactory = new UrbanTransportFactory();
        TransportClient urbanClient = new TransportClient(urbanFactory);
        urbanClient.operate();  // Conduzindo um carro | Rodando as rodas do carro

        // Criando um ambiente rural
        TransportFactory ruralFactory = new RuralTransportFactory();
        TransportClient ruralClient = new TransportClient(ruralFactory);
        ruralClient.operate();  // Conduzindo um caminhão | Rodando as rodas do caminhão

    }
}