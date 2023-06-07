package behavioral_pattern.state;

public class OrderShippedState implements OrderState {
    @Override
    public void cancelOrder(Order order) {
        System.out.println("이미 배송된 상품이어서 취소할 수 없습니다.");
    }

    @Override
    public void verifyPayment(Order order) {
        System.out.println("이미 결재된 상품입니다.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("이미 배송된 상품입니다.");
    }
}
