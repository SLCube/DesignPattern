package structuralPattern.decorator;

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
    }
}
