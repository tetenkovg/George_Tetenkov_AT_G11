package homework.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {

    public static int generateCoordinate(){
        Random random = new Random();
        int randomNumber = random.nextInt(78) + 1;
        System.out.printf("I have generated point with value " + randomNumber);
        return randomNumber;
    }
}
