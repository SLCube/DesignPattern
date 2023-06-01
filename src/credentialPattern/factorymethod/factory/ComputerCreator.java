package credentialPattern.factorymethod.factory;

import credentialPattern.factorymethod.product.Computer;
import credentialPattern.factorymethod.product.Product;

public class ComputerCreator extends Creator {
    @Override
    protected Product createProduct() {
        return new Computer();
    }
}
