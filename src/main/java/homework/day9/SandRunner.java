package homework.day9;

import homework.day7.utils.Sand;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class SandRunner {

//    14.
//    Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
//    Заполнить 5 объектами песка с весом (12, 8, 15, 7, 11) и именами (Речной, Речной, Карьерный, Карьерный, Речной) соответственно
//    Отфильтровать только тот песок, который весит больше 9 и имя которого содержит букву "ч"
//    Отсортировать по весу в восходящем порядке
//    На основании существующего потока данных создать новый, в котором каждый новый Sand имеет вес умноженный на 2, и имя в верхнем регистре
//    На основании получившегося потока данных создать коллекцию Map, где ключ - это вес, а значение - имя
//    Отпечатать каждый из элементов карты в виде value:key в текстовый файл

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));


        Map<Integer, String> sandMap = sandbox.stream()
                .filter(sand -> sand.getName().contains("ч") && sand.getWeight() > 9)
                .sorted(Comparator.comparingInt(sand -> sand.getWeight()))
                .map(sand -> new Sand(sand.getWeight() * 2, sand.getName().toLowerCase()))
                .collect(Collectors.toMap(
                        sand -> sand.getWeight(),
                        sand -> sand.getName(),
                        (existing, replacement) -> existing));

        try {
            Files.write(Paths.get("sand.txt"),
                    sandMap.entrySet().stream()
                            .map((entry -> entry.getValue() + " : " + entry.getKey()))
                            .collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
