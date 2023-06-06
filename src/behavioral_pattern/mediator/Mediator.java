package behavioral_pattern.mediator;

public interface Mediator {
    void addColleague(Colleague colleague);

    void mediate(Colleague colleague);
}
