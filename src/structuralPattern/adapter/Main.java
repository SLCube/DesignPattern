package structuralPattern.adapter;

/**
 * adapter pattern
 *
 * 어댑터 패턴이란 서로 호환성이 없는 인터페이스를 사용하는 클래스에서 호환되게끔 해주는 패턴이다.
 */
public class Main {
    public static void main(String[] args) {
        IphoneUser userA = new IphoneUser(new EarPhoneAdapter(new ThreePointFiveEarPhone()));
        userA.listenMusic();

        IphoneUser userB = new IphoneUser(new EarPhoneAdapter(new AnotherEarPhone()));
        userB.listenMusic();
    }
}
