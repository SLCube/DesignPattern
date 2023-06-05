package structuralPattern.decorator;

public abstract class FighterPlaneDecorator implements Weapon {

    private Weapon weapon;

    public FighterPlaneDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        weapon.attack();
    }
}
