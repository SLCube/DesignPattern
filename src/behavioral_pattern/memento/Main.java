package behavioral_pattern.memento;

/**
 * Memento Pattern
 * 특정시점의 상태를 저장하고 그 상태를 반환하고 싶을 때 사용하는 패턴이다.
 * Memento를 사용, 관리하는데 예상보다 많은 비용이 사용될 수 있다.
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");

        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
