package credentialPattern.prototype;

public class ConcretePrototype implements Prototype {

    private String name;
    private int price;

    public ConcretePrototype(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype prototype = new ConcretePrototype(this.name, this.price);

        return prototype;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("name is " + name + ", \n")
                .append("price is " + price)
                .toString();
    }
}
