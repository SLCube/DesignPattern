package behavioral_pattern.observer.ex2;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        NewsObserver news1 = new NewsObserver("news1");
        NewsObserver news2 = new NewsObserver("news2");

        stockMarket.attach(news1);
        stockMarket.attach(news2);

        stockMarket.updateStockPrice("주식1", 10000);
        stockMarket.detach(news2);

        stockMarket.updateStockPrice("주식2", 20000);
    }
}
