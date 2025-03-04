package selfstudy.udemy.collections.task.task1;

import io.cucumber.java.ja.然し;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MarkLength {

    public static void main(String[] args) {

    List<String> list = new ArrayList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        markLength((list));
    }

    public static void markLength(List<String> list) {

        String targetValue = "****";
        int targetLength = 4;


        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String nextValue = iterator.next();
            if (nextValue.length() == targetLength) {
                iterator.set(targetValue);
                iterator.add(nextValue);
            }
        }

        System.out.println(list);

    }
}
