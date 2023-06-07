package behavioral_pattern.observer.ex1;

/**
 * Observer Pattern
 *
 * N : 1의 관계이면서 N이 1의 변화를 알아야하고 변화로 인해 또 다른 행동을 취해야할때 사용하면 좋다.
 * observer와 subject사이엔 느슨한 결합만이 존재하기 때문에 시스템이 유연해진다.
 *
 * 남용시 상태관리가 힘들어지며, 데이터 배분을 잘못하게되면 예상치 못한 문제가 발생할 수 있다.
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Customer customer1 = new Customer("홍길동");
        Customer customer2 = new Customer("철수");

        order.attach(customer1);
        order.attach(customer2);

        order.updateState("배송 준비중");

        order.detach(customer2);

        order.updateState("배송중");
    }
}
