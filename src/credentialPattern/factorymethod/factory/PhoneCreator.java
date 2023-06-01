package credentialPattern.factorymethod.factory;

import credentialPattern.factorymethod.product.Phone;
import credentialPattern.factorymethod.product.Product;

public class PhoneCreator extends Creator {
    @Override
    protected Product createProduct() {
        return new Phone();
    }
}
