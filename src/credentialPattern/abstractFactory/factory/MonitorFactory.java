package credentialPattern.abstractFactory.factory;

import credentialPattern.abstractFactory.product.Monitor;
import credentialPattern.abstractFactory.product.Product;

public class MonitorFactory implements AbstractFactory {

    @Override
    public Product createProduct() {
        return new Monitor();
    }
}
