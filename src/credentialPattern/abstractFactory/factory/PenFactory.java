package credentialPattern.abstractFactory.factory;

import credentialPattern.abstractFactory.product.Pen;
import credentialPattern.abstractFactory.product.Product;

public class PenFactory implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new Pen();
    }
}
