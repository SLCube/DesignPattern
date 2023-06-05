package structuralPattern.facade;

/**
 * facade pattern
 *
 * 서브클래스의 기능을 직접 사용할 수 도 있지만, 서브클래스의 기능을 모아서 사용할때도 있는경우
 * facade 인터페이스에 모아서 한번에 실행 가능하게 만듦.
 *
 * 설령 클라이언트가 서브클래스를 모르더라도 서브클래스의 기능을 사용할 수 있음.
 *
 * 클라이언트와 서브시스템의 결합도를 낮추면서 공개할것 공개하지 않을것을 구별해줌.
 *
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(new ComponentA(), new ComponentB());
        facade.operation();
    }
}
