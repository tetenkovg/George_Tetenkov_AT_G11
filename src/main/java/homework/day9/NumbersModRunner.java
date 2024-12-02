package homework.day9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class NumbersModRunner {
//    9.
//    Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090) через (Stream.of())
//    Отфильтровать те числа, которые содержать цифру 3
//    Разбить числа на отдельные цифры и заменить цифры соответствующими словами
//    Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки

    public static void main(String[] args) {

        HashMap<Character, String> digitToWord = new HashMap<>();

        digitToWord.put('0', "zero");
        digitToWord.put('1', "one");
        digitToWord.put('2', "two");
        digitToWord.put('3', "three");
        digitToWord.put('4', "four");
        digitToWord.put('5', "five");
        digitToWord.put('6', "six");
        digitToWord.put('7', "seven");
        digitToWord.put('8', "eight");
        digitToWord.put('9', "nine");

        Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090)
                .map(value -> String.valueOf(value))
                .filter(value -> value.contains("3"))
                .flatMap(value -> Arrays.stream(value.split("")))
                .map(digit -> digitToWord.get(digit.charAt(0)))
                    .distinct()
                    .sorted((a, b) -> b.compareTo(a))
                    .forEach(System.out::println);
    }

}
