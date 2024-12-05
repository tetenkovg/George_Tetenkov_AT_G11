package homework.day9;

import homework.day7.utils.Bubble;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRunner {
//    10.
//    Создать поток данных дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Stream.of())
//    Округлить каждое число до целого
//    На основании этого потока сгенерировать новый поток данных целых чисел из случайных чисел с границами от 0 до числа из иходного потока данных
//    Убрать дубликаты значений
//    Заменить каждое число в получившемся потоке данных новым потоком состоящим из обьектов Bubble в количестве равному заменяемому числу,
//    создавая обьекты с обьемом равным числу из исходного потока и именем по маске "Bubble vol-" + i, где i - число из исходного потока
//    Отпечатать в консоль каждый из обьектов нового потока с новой строки
//    Найти общий обьем полученного потока пузырьков и отпечатать в консоль

    public static void main(String[] args) {

        Random random = new Random();
        Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9)
                .mapToInt(d -> (int) Math.round(d))
                .map(i -> random.nextInt(i + 1))
                .distinct()
                .boxed()
                .flatMap(i -> IntStream.range(0, i)
                        .mapToObj(n -> new Bubble("Bubble vol-" + i, i))
                )
                .peek(System.out::println)
                .mapToInt(Bubble::getVolume)
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);
    }
}

