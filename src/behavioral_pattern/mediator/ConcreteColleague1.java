package behavioral_pattern.mediator;

public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println(this.getName() + " received " + this.getName() + "'s message : " + colleague.getMessage());
    }
}
