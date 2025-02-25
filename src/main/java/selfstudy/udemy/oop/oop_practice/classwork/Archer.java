package selfstudy.udemy.oop.oop_practice.classwork;

public class Archer extends Hero {

    Wolf wolf;


    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Pes", 12);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacks " + enemy.getName());
        wolf.attackEnemy(enemy);
    }


    public class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " and " + Archer.this.getName() + " наносят совместный урон");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}
