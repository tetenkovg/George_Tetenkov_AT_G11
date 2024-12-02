package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class CitiesRunner {

//    3.
//    Создать пустой список стрингов cities (через new ArrayList)
//    Добавить в список 3 города (Минск, Москва, Берлин)
//    Посчитать сумму всех буков во всех словах и вывести число в консоль

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        long totalLength = cities.stream().mapToInt(c -> c.length()).sum();

        System.out.println(totalLength);

    }
}
