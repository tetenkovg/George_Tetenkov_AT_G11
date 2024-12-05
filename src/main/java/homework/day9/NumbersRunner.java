package homework.day9;

import java.util.stream.Stream;

public class NumbersRunner {
//    8.
//    Создать поток данных целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Stream.of())
//    В потоке данных проитерировать числа и отпечатать числа в консоль новой строки
//    Отсортировать и снова отпечатать в консоль с новой строки
//    Посчитать сумму всех чисел и вывести результат в консоль

    public static void main(String[] args) {

        long sum = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699)
                .peek(value -> System.out.println(value))
                .sorted()
                .peek(value -> System.out.println(value))
                .mapToInt(value -> value.intValue())
                .sum();
        System.out.println(sum);
    }
}
