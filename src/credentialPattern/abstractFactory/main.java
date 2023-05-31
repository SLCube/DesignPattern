package credentialPattern.abstractFactory;

import credentialPattern.abstractFactory.factory.ComputerFactory;
import credentialPattern.abstractFactory.factory.MonitorFactory;
import credentialPattern.abstractFactory.factory.ProductFactory;
import credentialPattern.abstractFactory.factory.TicketFactory;
import credentialPattern.abstractFactory.product.Product;

public class main {
    public static void main(String[] args) {
        Product computer = ProductFactory.createProduct(new ComputerFactory());
        Product ticket = ProductFactory.createProduct(new TicketFactory());
        Product monitor = ProductFactory.createProduct(new MonitorFactory());

        System.out.println("computer.toString() = " + computer.toString());
        System.out.println("ticket.toString() = " + ticket.toString());
        System.out.println("monitor.toString() = " + monitor.toString());
    }
}
