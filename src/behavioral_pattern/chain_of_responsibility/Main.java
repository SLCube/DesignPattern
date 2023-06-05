package behavioral_pattern.chain_of_responsibility;

/**
 * chain of responsibility pattern
 * <p>
 * 송신측과 수신측의 결합도를 없애기 위한 패턴이다.
 * <p>
 * 송신측은 수신측에서 어떤 처리를 하는지 몰라도 되며
 * 수신측은 여러개의 핸들러를 통해 자유롭게 요청을 처리 할 수 있다.
 * <p>
 * 자유롭게라는 말의 의미는, 새로운 클래스를 추가해 새로운 핸들러를 추가할 수 있으며
 * 핸들러들의 순서도 자유롭게 바꿀수있다.
 * <p>
 * 핸들러간의 연결고리를 꼼꼼히 살펴볼 필요가 있다.
 * 내부에 사이클이 발생할 수 있으며, 모든 핸들러가 요청을 처리 할 수 없다면, 요청이 무시되고 버려질 수 있다.
 */
public class Main {
    public static void main(String[] args) {
        Chain negativeProcessor = new NegativeProcessor();
        Chain zeroProcessor = new ZeroProcessor();
        Chain positiveProcessor = new PositiveProcessor();

        negativeProcessor.setNext(zeroProcessor);
        zeroProcessor.setNext(positiveProcessor);

        negativeProcessor.process(new Number(-1));
        negativeProcessor.process(new Number(0));
        negativeProcessor.process(new Number(-10));
        negativeProcessor.process(new Number(10));
    }
}
