package selfstudy.codewars;

import java.lang.reflect.Array;

public class SmashWords {
    public static String smash(String... words) {
        return String.join(" ", words);
    }


    public static void main(String[] args) {

        String[] array = {"hello", "world", "this", "is", "great"};

        System.out.println(smash(array));


    }
}
