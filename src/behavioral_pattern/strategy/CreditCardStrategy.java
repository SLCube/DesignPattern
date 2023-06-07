package behavioral_pattern.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("신용카드로 결재합니다. 결재금액: " + amount);
    }
}
