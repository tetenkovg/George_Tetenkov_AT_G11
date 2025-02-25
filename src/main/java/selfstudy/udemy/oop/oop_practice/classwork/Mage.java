package selfstudy.udemy.oop.oop_practice.classwork;

public class Mage extends Hero {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacks " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
