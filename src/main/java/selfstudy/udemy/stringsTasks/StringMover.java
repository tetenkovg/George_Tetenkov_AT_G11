package selfstudy.udemy.stringsTasks;

import org.openqa.selenium.InvalidArgumentException;

import java.util.Arrays;
import java.util.List;

public class StringMover {

    public static void main(String[] args) {

        String text = ":((((:(::((:(((";

        System.out.println(stringer(text));

        String fio = "George Morger shmorger";

        List<String> list = Arrays.stream(fio.split(" ")).toList();

        System.out.println(format(list));

    }

    public static String stringer(String text) {
        return text.replace(":(", ":)");
    }

    public static String format(List<String> list) {
        if (list.size() != 3) {
            throw new IllegalArgumentException("invalid List");
        }
        char firstNameChar = list.get(0).toUpperCase().charAt(0);
        char lastNameChar = list.get(1).toUpperCase().charAt(1);
        char pastronymicNameChar = list.get(2).toUpperCase().charAt(2);

        return String.format("%s%s%s", firstNameChar, lastNameChar, pastronymicNameChar);

    }
}
