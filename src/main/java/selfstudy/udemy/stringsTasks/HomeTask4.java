package selfstudy.udemy.stringsTasks;

import java.util.ArrayList;
import java.util.List;

public class HomeTask4 {

    public static void main(String[] args) {
        String text = "Привет 8, как 1 2 твои дела?Может4, сделать 3 дело ?";

        System.out.println(SumOfStringInts(text));
        System.out.println(ArrayOfStringInts(text).toString());
    }

    private static int[] ArrayOfStringInts(String text) {
        List<Integer> integersList = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                integersList.add(c - '0');
            }
        }   
        int[] intsArray = new int[integersList.size()];
        for (int i = 0; i < integersList.size(); i++) {
            intsArray[i] = integersList.get(i);
            System.out.println(intsArray[i]);
        }

        return intsArray;
    }

    private static int SumOfStringInts(String text) {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                counter += c - '0';
            }
        }
        return counter;
    }


}
