package credentialPattern.factorymethod;

import credentialPattern.factorymethod.factory.ComputerCreator;
import credentialPattern.factorymethod.factory.PhoneCreator;
import credentialPattern.factorymethod.product.Product;

public class Main {
    public static void main(String[] args) {

        ComputerCreator computerCreator = new ComputerCreator();
        Product computer = computerCreator.newInstance();

        PhoneCreator phoneCreator = new PhoneCreator();
        Product phone = phoneCreator.newInstance();
    }
}
