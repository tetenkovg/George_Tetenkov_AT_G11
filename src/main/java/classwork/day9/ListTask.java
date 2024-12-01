package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListTask {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().findFirst().orElse("мама"));

        System.out.println(list.stream().filter(x -> x.equals("мама")).findFirst().get());

        System.out.println(list.stream().skip(4).findFirst().get());

        System.out.println(list.stream().skip(3).toList());

        System.out.println(list.stream().distinct().filter(x -> x.contains("м")).toList());


    }


}
