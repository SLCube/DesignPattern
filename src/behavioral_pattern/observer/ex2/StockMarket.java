package behavioral_pattern.observer.ex2;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<StockObserver> observers = new ArrayList<>();

    public void attach(StockObserver observer) {
        observers.add(observer);
    }

    public void detach(StockObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String stockName, int price) {
        for (StockObserver observer : observers) {
            observer.update(stockName, price);
        }
    }

    public void updateStockPrice(String stockName, int price) {
        notifyObservers(stockName, price);
    }
}
