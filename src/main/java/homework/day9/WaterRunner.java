package homework.day9;

import homework.day7.utils.Water;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
//    13.
//    Создать поток данных water класса Water (через new Stream.of)
//    из 4 объектов воды с цветом (Прозрачная, Прозрачная, Мутная, Синяя) и запахом (Нет, Нет, Аммиачный, Мятный) соответственно
//    Отфильтровать воду, цвет которой не "Прозрачная"
//    Отсортировать в нисходящем порядке по запаху
//    На основании существующего потока данных создать новый, в котором каждая новая Water имеет запах с удвоенной буквой ы, если такая встречается
//    Обьединить запах всех обьектов в одну строку
//    Найти количество буков в ней и отпечатаь в консоль

    public static void main (String[] args){


       int length =  Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный"))
                .filter(water -> !water.getColor().equals("Прозрачная"))
                .sorted((a,b) -> a.getSmell().compareTo(b.getSmell()))
                .map(water -> new Water(water.getColor(), water.getSmell().replace("ы", "ыы")))
                .map(water -> water.getSmell())
                .collect(Collectors.joining(""))
                .length();

        System.out.println(length);
    }
}
