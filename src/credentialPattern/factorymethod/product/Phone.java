package credentialPattern.factorymethod.product;

public class Phone implements Product{
    @Override
    public void turnOn() {
        System.out.println("Phone turn on!!");
    }
}
