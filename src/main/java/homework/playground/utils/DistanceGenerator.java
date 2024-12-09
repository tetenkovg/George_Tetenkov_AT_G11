package homework.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    static Random random = new Random();

    public static int generateDistance() {
        int randomNumber = random.nextInt(99) + 1;
        System.out.println("DistanceGenerator: I have generated distance with value: " + randomNumber);
        return randomNumber;
    }
}
