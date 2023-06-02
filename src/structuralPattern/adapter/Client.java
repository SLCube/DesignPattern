package structuralPattern.adapter;

public class Client {
    private Client() {
    }

    public static void execute() {
        Target target = new Adapter(new SimpleAdaptee());
        target.operation();
    }
}
