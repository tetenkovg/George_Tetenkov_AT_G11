package selfstudy.udemy.stringsTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTask5 {
    public static void main(String[] args) {
        String text = "Here is a sample text";

        for (int i = 0; i < stringDelimiter(text, 10).length; i++) {
            System.out.println(stringDelimiter(text , 10)[i]);
        }

        String text2 = text.substring(0, 10);

        System.out.println(text2);


    }

    public static String[] stringDelimiter(String text, int n) {
        List<String> list = new ArrayList<>();
        int substringer = 0;
        int substingerTwo = 0;

        for (int i = 0; i <= text.length() / n; i++) {
            substingerTwo += n;
            if (substingerTwo > text.length()){
                list.add(text.substring(substringer, text.length()));
            } else {
                list.add(text.substring(substringer, substingerTwo));
                substringer += n;
            }

        }

        String[] array = list.toArray(new String[0]);

        return array;
    }
}
