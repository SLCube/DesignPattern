package behavioral_pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void mediate(Colleague colleague) {
        for (Colleague receiverColleague : colleagues) {
            System.out.println("\tMediating " + colleague.getName() + " to " + receiverColleague.getName());
            receiverColleague.receive(colleague);
        }
    }
}
