package credentialPattern.abstractFactory.product;

public abstract class Product {
    public abstract String getName();

    @Override
    public String toString() {
        return "Product name is " + getName();
    }
}
