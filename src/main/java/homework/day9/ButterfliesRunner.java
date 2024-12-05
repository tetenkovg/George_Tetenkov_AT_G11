package homework.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ButterfliesRunner {
    public static void main(String[] args) {

        List<String> butterflies;

        butterflies = Stream.of("Common blue", "Swallowtail", "Aglais io", "Common blue")
                .map(b -> "\"" + b + "\"" )
                .filter(b -> b.contains("a") && b.contains("o"))
                .toList();

        System.out.println(butterflies);

    }
}
