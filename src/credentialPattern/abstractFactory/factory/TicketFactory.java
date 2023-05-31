package credentialPattern.abstractFactory.factory;

import credentialPattern.abstractFactory.product.Product;
import credentialPattern.abstractFactory.product.Ticket;

public class TicketFactory implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new Ticket();
    }
}
