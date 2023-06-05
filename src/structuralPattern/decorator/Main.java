package structuralPattern.decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println("=============================");

        Component decoratorA = new ConcreteDecoratorA(new ConcreteComponent());
        Component decoratorB = new ConcreteDecoratorB(new ConcreteComponent());

        decoratorA.operation();
        System.out.println("=============================");
        decoratorB.operation();
        System.out.println("=============================");
    }
}
