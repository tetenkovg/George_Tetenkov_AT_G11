package homework.playground.utils;

import homework.playground.essence.material.Diesel;
import homework.playground.essence.material.Petrol;
import homework.playground.essence.material.Pourable;

import java.util.Random;

public class VolumeGenerator {

    public static int generateVolume(Pourable pourable) {
        Random random = new Random();
        int volume;
        if (pourable instanceof Petrol || pourable instanceof Diesel) {
            volume = random.nextInt(49) + 1;
        } else {
            volume = random.nextInt(50) + 50;
        }
        System.out.println("VolumeGenerator: I have generated volume of " + pourable.getClass().getSimpleName() +
                " with value: " + volume);
        return volume;
    }
}
