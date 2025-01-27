package java_core.homeWork__Interface;

public class Mage extends Character implements ISpecialAbility{

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void useAbility() {
        System.out.println("FireBall !!!");

    }
}
