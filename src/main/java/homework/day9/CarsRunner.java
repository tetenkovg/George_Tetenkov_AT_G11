package homework.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CarsRunner {

//    4.
//    Создать поток данных стрингов из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через Stream.of())
//    Оставить в потоке только уникальные названия авто
//    Отфильтровать только те названия, которые содержат букву "и"
//    Пропустить 1 название
//    Все названия привести в верхний регистр
//    Отпечатать все названия в консоль с новой строки
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди")
                .distinct()
                .filter(car -> car.contains("и"))
                .skip(1)
                .map(car -> car.toUpperCase())
                .forEach(car -> System.out.println(car));

    }
}
