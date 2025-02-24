package selfstudy.udemy.oop.encapsulation.oop_practice;

public class Enemy implements Mortal {
    private int health;
    private String name;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }


    public void takeDamage(int damage) {
        if(isAlive() && health <= damage){
            health = 0;
            System.out.println(getName() + " помер");
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(getName() + " Says: I have " + getHealth() + " health.");
        }


    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
