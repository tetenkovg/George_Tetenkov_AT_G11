package selfstudy.udemy.oop.encapsulation.oop_practice;

public class Archer extends Hero{
    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacks " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
