package credentialPattern.abstractFactory.factory;

import credentialPattern.abstractFactory.product.Product;

public class ProductFactory {

    private ProductFactory() {
    }

    public static Product createProduct(AbstractFactory factory) {
        return factory.createProduct();
    }
}
