package credentialPattern.abstractFactory;

import credentialPattern.abstractFactory.factory.ComputerFactory;
import credentialPattern.abstractFactory.factory.ProductFactory;
import credentialPattern.abstractFactory.factory.TicketFactory;
import credentialPattern.abstractFactory.product.Product;

public class main {
    public static void main(String[] args) {
        Product computer = ProductFactory.createProduct(new ComputerFactory());
        Product ticket = ProductFactory.createProduct(new TicketFactory());

        System.out.println("computer.toString() = " + computer.toString());
        System.out.println("ticket.toString() = " + ticket.toString());
    }
}
