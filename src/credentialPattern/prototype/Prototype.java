package credentialPattern.prototype;

/**
 * 같은 객체를 복사하기 위한 패턴
 *
 * 복사하는 코드를 구현클래스에 의존하지 않게끔 해줌
 * 복잡한 복사를 구현클래스에 숨길 수 있음(위와 같은말아닌가)
 * 중복 초기화를 막을 수 있음.
 *
 * 객체가 순환참조를 하는 경우엔 복사가 까다로울 수 있음.
 */
public interface Prototype {
    Prototype clone();
}
