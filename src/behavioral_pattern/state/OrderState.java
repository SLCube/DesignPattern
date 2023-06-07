package behavioral_pattern.state;

public interface OrderState {
    void cancelOrder(Order order);

    void verifyPayment(Order order);

    void shipOrder(Order order);
}
