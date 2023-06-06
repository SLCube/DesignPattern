package behavioral_pattern.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String status;
    private List<OrderObserver> observers = new ArrayList<>();

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(status);
        }
    }

    public void updateState(String status) {
        this.status = status;
        notifyObservers();
    }
}
