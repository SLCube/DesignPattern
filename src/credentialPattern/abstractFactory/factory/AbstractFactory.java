package credentialPattern.abstractFactory.factory;

import credentialPattern.abstractFactory.product.Product;

/**
 * abstract factory pattern(추상 팩토리 패턴), 다른이름 kit
 * <p>
 * 의도 : 상세화된 서브클래스를 정의하지 않고도 서로 관련성이 있거나 독립적인 여러 객체의 군을 생성하기 위한 인터페이스 제공
 * <p>
 * 활용성
 * <p>
 * 객체가 생성되거나, 구성, 표현되는 방식과 무관하게 시스템을 독립적으로 만들고자 할 때
 *
 * 일관된 행동을 갖고있는 제품군을 확장시킬때 팩토리와 제품클래스만 추가하면 되기때문에 확장에 굉장히 용이하다.
 * 그러나 새로운 행동이 추가되거나 기존 제품들과는 다른 행동을 갖는 제품을 추가해야된다면 새로운 추상팩토리를 추가해야된다.
 */
public interface AbstractFactory {

    Product createProduct();
}
