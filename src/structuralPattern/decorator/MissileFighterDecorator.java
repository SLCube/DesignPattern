package structuralPattern.decorator;

public class MissileFighterDecorator extends FighterPlaneDecorator {

    public MissileFighterDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Missile Fighter Attack!!");
    }
}
