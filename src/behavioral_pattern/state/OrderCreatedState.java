package behavioral_pattern.state;

public class OrderCreatedState implements OrderState {

    @Override
    public void cancelOrder(Order order) {
        System.out.println("이미 생성된 상품입니다. 취소할 수 없습니다.");
    }

    @Override
    public void verifyPayment(Order order) {
        System.out.println("결재를 확인했습니다.");
        order.setOrderState(new OrderProcessingState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("결재되지 않은 상품이라 배송을 할 수 없습니다.");
    }
}
