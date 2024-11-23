package homework.playground.utils;
import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {

        Random random = new Random();
        int randomNumber = random.nextInt(40) + 1;

        if (randomNumber <= 9) {
            return "NORTH";
        } else if (randomNumber <= 19) {
            return "SOUTH";
        } else if (randomNumber <= 29) {
            return "WEST";
        } else if (randomNumber <= 39) {
            return "EAST";
        }
        return "Cannot generate Direction";
    }

}
