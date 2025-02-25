package selfstudy.udemy.oop.oop_practice.classwork;

public class TrainingGround {
    public static void main(String[] args) {

        Hero warrior = new Warrior("Grimly", 10);
        Hero mage = new Mage("Pendalf", 5);
        Hero archer = new Archer("Logo las", 7);
        Enemy enemy = new Enemy("Балрог", 100);

        attackEnemy(enemy, warrior, mage, archer);


    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {

        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }

            }
        }
    }
}
