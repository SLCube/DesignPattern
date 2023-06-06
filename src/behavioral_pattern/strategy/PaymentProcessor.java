package behavioral_pattern.strategy;

public class PaymentProcessor {

    public void processPayment(int amount, PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(amount);
    }
}
