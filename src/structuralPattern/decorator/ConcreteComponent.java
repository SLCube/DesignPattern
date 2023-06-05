package structuralPattern.decorator;

public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("Concrete Component operation");
    }
}
