package credentialPattern.prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("name", 1000);
        Prototype clone = prototype.clone();

        System.out.println("prototype.toString() = " + prototype.toString());
        System.out.println("clone.toString() = " + clone.toString());
    }
}
