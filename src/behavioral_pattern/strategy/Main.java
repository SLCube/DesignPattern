package behavioral_pattern.strategy;

/**
 * Strategy pattern
 * <p>
 * 행위를 캡슐화해 동적으로 행위를 자유롭게 갈아끼울 수 있게한다.
 * <p>
 * 공통로직이 부모클래스에 있지 않고 context라는 별개의 클래스에 있기 때문에 전략구현체에 대한 영향도가 적음.
 * context가 strategy라는 인터페이스에 의존하고 있기 때문에 갈아 끼우기 쉬움.
 * <p>
 * 로직이 늘어날 때 마다 구현체 클래스가 늘어남.
 * context와 strategy를 한번 조립하면 전략을 변경하기 힘듦.
 */
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(10000, new CreditCardStrategy());
        processor.processPayment(20000, new PaypalStrategy());
    }
}