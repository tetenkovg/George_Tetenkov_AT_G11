package selfstudy.udemy.oop.encapsulation.task2;

public class AtmRunner {
    public static void main(String[] args) {
        Atm atm = new Atm(2, 1, 1);

        atm.withdrawCash(180);
    }
}
