package selfstudy.udemy.oop.oop_practice.classwork;

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
