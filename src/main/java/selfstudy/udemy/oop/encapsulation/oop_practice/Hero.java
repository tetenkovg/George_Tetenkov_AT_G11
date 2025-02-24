package selfstudy.udemy.oop.encapsulation.oop_practice;

public abstract class Hero {

    private String name;
   private int damage;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(0);
    }

    public int getDamage() {
        return damage;
    }
}
