package structuralPattern.adapter;

public class SimpleAdaptee implements Adaptee{
    @Override
    public void specificOperation() {
        System.out.println("A Simple Adaptee Operation");
    }
}
