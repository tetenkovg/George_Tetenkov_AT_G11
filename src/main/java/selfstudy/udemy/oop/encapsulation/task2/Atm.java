package selfstudy.udemy.oop.encapsulation.task2;

import io.cucumber.java.it.Ma;

public class Atm {

    private int twentyBacks;
    private int fiftyBacks;
    private int oneHynderBacks;


    public Atm(int twentyBacks, int fiftyBacks, int oneHynderBacks) {
        this.twentyBacks = twentyBacks;
        this.fiftyBacks = fiftyBacks;
        this.oneHynderBacks = oneHynderBacks;
    }

    public void setTwentyBacks(int twentyBacks) {
        this.twentyBacks = twentyBacks;
    }

    public void setFiftyBacks(int fiftyBacks) {
        this.fiftyBacks = fiftyBacks;
    }

    public void setOneHynderBacks(int oneHynderBacks) {
        this.oneHynderBacks = oneHynderBacks;
    }

    public boolean withdrawCash(int sum) {
        if (sum > getSum()) {
            System.out.println("Нет столько денех");
            return false;
        }
        int leftAmountForWithdraw = sum;

        int oneHynderBacksWithdraw = leftAmountForWithdraw / 100;
        oneHynderBacksWithdraw = Math.min(oneHynderBacksWithdraw, this.oneHynderBacks);
        leftAmountForWithdraw -= oneHynderBacksWithdraw * 100;

        int fiftyBacksWithdraw = leftAmountForWithdraw / 50;
        fiftyBacksWithdraw = Math.min(fiftyBacksWithdraw, this.fiftyBacks);
        leftAmountForWithdraw -= fiftyBacksWithdraw * 50;

        int twentyBacksWithdraw = leftAmountForWithdraw / 20;
        twentyBacksWithdraw = Math.min(twentyBacksWithdraw, this.twentyBacks);
        leftAmountForWithdraw -= twentyBacksWithdraw * 20;


        this.oneHynderBacks -= oneHynderBacksWithdraw;
        this.fiftyBacks -= fiftyBacksWithdraw;
        this.twentyBacks -= twentyBacksWithdraw;

        System.out.println("100 баксов " + oneHynderBacksWithdraw);
        System.out.println("50 баксов " + fiftyBacksWithdraw);
        System.out.println("20 баксов " + twentyBacksWithdraw);
        if (leftAmountForWithdraw > 0){
            System.out.println("То что я не смогу снять: " + leftAmountForWithdraw);
        }
        System.out.println("Остаток на счете: " + this.getSum());

        return true;

    }


    public int getTwentyBacks() {
        return twentyBacks;
    }

    public int getFiftyBacks() {
        return fiftyBacks;
    }

    public int getOneHynderBacks() {
        return oneHynderBacks;
    }

    public int getSum() {
        return this.twentyBacks * 20 + this.fiftyBacks * 50 + this.oneHynderBacks * 100;
    }
}
