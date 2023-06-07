package behavioral_pattern.template_method;

/**
 * Template Method pattern
 * <p>
 * 부모클래스(추상클래스)에서 메소드의 전체 골격을 구성해두고 자식클래스에서 상세 메소드를 구현하는 패턴이다.
 * <p>
 * 코드의 재사용성이 올라가며, 공통 알고리즘을 갖는 객체들의 행동이 일관성을 갖는다.
 * <p>
 * 알고리즘의 구조를 정적으로 정의하므로, 구조가 변경된다면 부모클래스의 수정이 불가피하며 그로인해 자식클래스까지 변화의 영향이 퍼질수 있다.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteClassA concreteClassA = new ConcreteClassA();
        ConcreteClassB concreteClassB = new ConcreteClassB();

        concreteClassA.template();
        System.out.println("===================");
        concreteClassB.template();
    }
}
