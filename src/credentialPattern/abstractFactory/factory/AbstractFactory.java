package credentialPattern.abstractFactory.factory;

import credentialPattern.abstractFactory.product.Product;

/**
 * abstract factory pattern(추상 팩토리 패턴), 다른이름 kit
 * <p>
 * 의도 : 상세화된 서브클래스를 정의하지 않고도 서로 관련성이 있거나 독립적인 여러 객체의 군을 생성하기 위한 인터페이스 제공
 * <p>
 * 활용성
 * 객체가 생성되거나, 구성, 표현되는 방식과 무관하게 시스템을 독립적으로 만들고자 할 때
 */
public interface AbstractFactory {

    Product createProduct();
}
