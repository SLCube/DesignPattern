package behavioral_pattern.state;

public class OrderProcessingState implements OrderState {
    @Override
    public void cancelOrder(Order order) {
        System.out.println("주문을 취소했습니다.");
        order.setOrderState(new OrderCreatedState());
    }

    @Override
    public void verifyPayment(Order order) {
        System.out.println("이미 결재된 상품입니다.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("주문을 배송합니다.");
        order.setOrderState(new OrderShippedState());
    }
}
