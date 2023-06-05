package structuralPattern.facade;

public class Facade {

    private ComponentA componentA;
    private ComponentB componentB;

    public Facade(ComponentA componentA, ComponentB componentB) {
        this.componentA = componentA;
        this.componentB = componentB;
    }

    public void operation() {
        componentA.operation();
        componentB.operation();
    }
}
