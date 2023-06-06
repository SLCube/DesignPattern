package behavioral_pattern.observer.ex2;

public class NewsObserver implements StockObserver {
    private String name;

    public NewsObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, int price) {
        System.out.println("[" + stockName + "]" + " 주가가 " + price + "로 변경되었습니다.");
    }
}
