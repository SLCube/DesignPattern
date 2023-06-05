package structuralPattern.decorator;

/**
 * Decorator pattern
 *
 * 객체에 새로운 기능을 추가하고 싶을 때 상속을 이용하는 것보다 유연하게 기능을 추가할 수 있음.
 * 원할때 마다 기능을 쉽게 탈부착 할 수 있음.
 * 그만큼 수정이 빈번한 기능에 사용하면 적절함.
 *
 * 작은 기능의 클래스가 많아질 우려가 있음.
 * 작은 기능의 클래스가 많아졌을때 다른사람이 봤을 때 이해하기 힘든 디자인이 될 수 있음.
 * 여러 기능을 부착하게 될 경우 초기화코드의 가독성이 떨어질 수 있음.
 */
public class Main {
    public static void main(String[] args) {

        Weapon basicFighterPlane = new FighterPlane();
        basicFighterPlane.attack();
        System.out.println("=================");

        Weapon missileFighterPlane = new LaserFighterDecorator(new FighterPlane());
        missileFighterPlane.attack();
        System.out.println("========");

        Weapon laserFighterPlane = new MissileFighterDecorator(new FighterPlane());
        laserFighterPlane.attack();

        System.out.println("=========");
        new MissileFighterDecorator(
                new LaserFighterDecorator(
                        new FighterPlane()
                )
        ).attack();

        System.out.println("=========");

        new PlasmaPlaneDecorator(new FighterPlane()).attack();

        System.out.println("=========");

        new PlasmaPlaneDecorator(
                new LaserFighterDecorator(
                        new MissileFighterDecorator(
                                new FighterPlane()
                        )
                )
        ).attack();
    }
}
