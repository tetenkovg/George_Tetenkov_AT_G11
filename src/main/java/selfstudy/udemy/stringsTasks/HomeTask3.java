package selfstudy.udemy.stringsTasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeTask3 {

    public static void main(String[] args) {
        String text = "HHello, My nname is GrRegore";

        System.out.println(deleter(text));
    }

    private static String deleter(String text) {

        String textMod = text.replace(" ", "").toUpperCase();
        StringBuilder sb = new StringBuilder(textMod);


        for (int i = textMod.length() - 1; i > 0; i--) {
            if (textMod.charAt(i) == textMod.charAt(i - 1)) {
                sb.deleteCharAt(i - 1);

            }
        }
        return sb.toString();


    }


}
