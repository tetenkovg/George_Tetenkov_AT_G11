package homework.day9;

import homework.day7.utils.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PersonsRunner {
//    12.
//    Создать поток данных people класса people.Person (через new Stream.of) с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно
//    Отфильтровать людей, которые моложе 60
//    Отсортировать в восходящем порядке по именам
//    На основании существующего потока данных создать новый, в котором каждый новый people.Person имеет возраст на 4 года больше исходного
//    Вычислить средний возраст конечного людей и отпечатать в новый текстовый файл

    public static void main(String[] args) {

        Stream.of(
                        new Person(32, "Коля"),
                        new Person(24, "Оля"),
                        new Person(55, "Вася"),
                        new Person(63, "Маша"))
                .filter(person -> person.getAge() < 60)
                .sorted((a, b) -> b.getName().compareTo(a.getName()))
                .map(person -> new Person(person.getAge() * 4, person.getName()))
                .mapToInt(person -> person.getAge())
                .average()
                .ifPresent(avgAge -> {
                    try {
                        Files.writeString(Paths.get("average_age.txt"), String.valueOf(avgAge));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}
