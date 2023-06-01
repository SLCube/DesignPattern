package credentialPattern.factorymethod.factory;

import credentialPattern.factorymethod.product.Product;

/**
 * 추상팩토리와 팩토리메소드의 차이점
 *
 * 팩토리메소드는 생성 method를 제공해주지만 추상 팩토리메소드는 생성 객체를 제공(인터페이스가 될수도있고, 추상클래스가 될수도있음)
 * 예시를 요리사로 들자면, 팩토리 메소드는 양식만 할줄 아는 요리사 한명만이 식당에 있는것과 같음.
 * 추상 팩토리 메소드는 양식, 일식, 한식, 중식 등 여러 종류의 요리사가 주방에 있는것
 * 성격이 다른 요리를 요리사(팩토리)만 바꾸면 문제없이 소화할 수 있음.
 */
public abstract class Creator {

    public Product newInstance() {
        Product product = createProduct();
        product.turnOn();
        return product;
    }

    protected abstract Product createProduct();
}
