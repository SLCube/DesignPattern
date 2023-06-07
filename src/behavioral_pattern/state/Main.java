package behavioral_pattern.state;

/**
 * State Pattern
 * <p>
 * 객체가 상태에 따라 다르게 행동해야 될 때, 상태를 직접 체크하는것이 아니라, 상태자체를 객체화 시켜
 * 필요에 따라 다르게 행동하게끔 위임하게 하는 패턴이다.
 * <p>
 * 조건문이 없어져 코드가 간결해지지만, 관리해야될 class수가 증가하는 단점이 있다.
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.verifyPayment();
        order.cancelOrder();
        order.shipOrder();
        order.verifyPayment();
        order.shipOrder();
        order.verifyPayment();
        order.cancelOrder();
        order.shipOrder();
    }
}
