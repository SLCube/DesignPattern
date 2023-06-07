package behavioral_pattern.state;

public class Order {
    private OrderState orderState;

    public Order() {
        orderState = new OrderCreatedState();
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void cancelOrder() {
        orderState.cancelOrder(this);
    }

    public void verifyPayment() {
        orderState.verifyPayment(this);
    }

    public void shipOrder() {
        orderState.shipOrder(this);
    }


}
