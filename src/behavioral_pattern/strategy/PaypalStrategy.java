package behavioral_pattern.strategy;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("페이팔로 결재합니다. 결재금액: " + amount);
    }
}
