package behavioral_pattern.observer.ex1;

public class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println("알림: " + name + ", 주문상태가 변경되었습니다. 현재상태 : " + state);
    }
}
