import io.github.msj.creative.abstract_factory.client.TransportClient;
import io.github.msj.creative.abstract_factory.transports.RuralTransportFactory;
import io.github.msj.creative.abstract_factory.transports.TransportFactory;
import io.github.msj.creative.abstract_factory.transports.UrbanTransportFactory;
import io.github.msj.structural.adapter.PaymentAdapter;
import io.github.msj.structural.adapter.adaptee.OldPaymentSystem;
import io.github.msj.structural.adapter.adaptee.OldPaymentSystemImpl;
import io.github.msj.structural.adapter.client.PaymentClient;
import io.github.msj.structural.adapter.target.PaymentGateway;
import io.github.msj.creative.builder.Order;

public class Main {
    public static void main(String[] args) {
        createPatternAbstractFactory();
        createPatternAdapter();
        createPatternBuilder();
    }

    private static void createPatternAbstractFactory() {
        // Criando um ambiente urbano
        TransportFactory urbanFactory = new UrbanTransportFactory();
        TransportClient urbanClient = new TransportClient(urbanFactory);
        urbanClient.operate();  // Conduzindo um carro | Rodando as rodas do carro

        // Criando um ambiente rural
        TransportFactory ruralFactory = new RuralTransportFactory();
        TransportClient ruralClient = new TransportClient(ruralFactory);
        ruralClient.operate();  // Conduzindo um caminhão | Rodando as rodas do caminhão
    }

    private  static void createPatternAdapter() {
        // Sistema antigo
        OldPaymentSystem oldPaymentSystem = new OldPaymentSystemImpl();

        // Usando o adapter para conectar o sistema antigo com o novo sistema
        PaymentGateway paymentGateway = new PaymentAdapter(oldPaymentSystem);

        // Cliente usa a interface moderna para fazer o pagamento
        PaymentClient paymentClient = new PaymentClient(paymentGateway);
        paymentClient.makePayment(100.0);  // Saída: Pagamento processado pelo sistema antigo: 100.0
    }

    private static void createPatternBuilder() {
        // Construindo um pedido simples
        Order order1 = new Order.OrderBuilder("Pizza")
                .drink("Coca-Cola")
                .dessert("Pudim")
                .extraSauce(true)
                .cutleryIncluded(false)
                .build();

        System.out.println(order1);

        // Construindo outro pedido com menos detalhes
        Order order2 = new Order.OrderBuilder("Hambúrguer")
                .drink("Suco de Laranja")
                .build();

        System.out.println(order2);
    }
}