package credentialPattern.singleton;

/**
 * 싱글톤 패턴은 쉽고 직관적이다.
 * 싱글톤 패턴에 대한 설명을 적기보단 단점과 해결방법에 대해 적겠다.
 *
 * 싱글톤 패턴은 여러 단점이 있지만, 내가 생각하는 제일 큰 단점은 전역상태를 갖고 어떤 곳에서든 쉽게 접근이 가능하다는 것이다.
 * 이로인해 싱글톤 객체에 변경이 일어나면 접근하고있는 다른 객체들에게 변경의 영향력이 전파되며 이는 코드 수정을 야기한다.
 *
 * 그럼 Spring에서의 Singleton은 무엇인가?
 *
 * Spring에서의 SingleTon은 우리가 Java코드로 직접 개발하지 않고 객체의 생성 소멸을 스프링에게 위임한다.
 * private 생성자나 static 변수를 이용하지 않아도 된다는 뜻이다.
 * 그러므로 private 생성자를 사용해서 생기는 상속불가의 문제라던가 static 변수를 이용하기때문에 어느곳에서든 접근이 가능하다는 문제가 발생하지 않는다.
 */
public class SingleTon {
    private static final SingleTon INSTANCE = new SingleTon();

    private SingleTon() {
        throw new IllegalStateException("Private Constructor");
    }

    public static SingleTon getInstance() {
        return INSTANCE;
    }
}
