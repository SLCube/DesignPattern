package credentialPattern.abstractFactory.factory;

import credentialPattern.abstractFactory.product.Computer;
import credentialPattern.abstractFactory.product.Product;

public class ComputerFactory implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new Computer();
    }
}
