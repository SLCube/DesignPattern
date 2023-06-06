package behavioral_pattern.observer.ex1;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Customer customer1 = new Customer("홍길동");
        Customer customer2 = new Customer("철수");

        order.attach(customer1);
        order.attach(customer2);

        order.updateState("배송 준비중");

        order.detach(customer2);

        order.updateState("배송중");
    }
}
