package homework.day9;

import homework.day7.utils.Bubble;
import homework.day7.utils.Chair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FurnitureRunner {
//    15.
//    Создать поток данных furniture класса Chair (через new Stream.of) furniture из 3 стульев
//    высотой (120, 90, 100, 110) и шириной (40, 30, 50, 45) соответственно
//    Отфильтровать только те стулья, который выше или равны 100 и уже или равны 50
//    Отсортировать по высоте, а если высота равна, то по ширине в нисходящем порядке
//    На основании существующего потока данных создать новый, в котором каждый новый Chair имеет высоту, деленную на 2, и ширину, умноженную на случайное число от 3 до 8 включительно
//    На основании получившегося потока данных создать новый, представляющий собой уникальный набо высот стульев умноженных на их ширину
//    Найти наибольшее значение в получившемся потоке
//    Создать новый обьект Bubble с обьемом равным найденному наибольшему значению и именем равным найденному наибольшему значению, представленным в виде словесного выражения каждой цифры числа этого значения, указанного чере пробел
//    Напечатать строковое значение полученного обьекта в текстовый файл

    public static void main(String[] args) {

        Random random = new Random();

        Stream.of(
                        new Chair(120, 40),
                        new Chair(90, 30),
                        new Chair(100, 50),
                        new Chair(110, 45))
                .filter(chair -> chair.getHeight() >= 100 && chair.getWidth() <= 50)
                .sorted(
                        Comparator.comparingInt((Chair chair) -> chair.getHeight())
                                .thenComparing(Comparator.comparingInt((Chair chair) -> chair.getWidth()).reversed()))
                .map(chair ->
                        new Chair(chair.getHeight() / 2,
                                chair.getWidth() * random.nextInt(6) + 3))
                .map(chair -> chair.getWidth() * chair.getHeight()).distinct()
                .mapToInt(chair -> chair.intValue())
                .max()
                .ifPresent(maxValue -> {
                    String numberInWords = String.valueOf(maxValue)
                            .chars()
                            .mapToObj(c -> digitToWord((char) c))
                            .collect(Collectors.joining(" "));

                    Bubble bubble = new Bubble(numberInWords, maxValue);

                    try {
                        Files.writeString(Paths.get("zestOMG.txt"), bubble.toString());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }

    private static String digitToWord(char c) {
        switch (c) {
            case '0':
                return "zero";
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";
            default:
                return "";
        }

    }
}

