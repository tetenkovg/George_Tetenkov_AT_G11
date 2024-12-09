package homework.day9;

import java.util.stream.Stream;

public class CountriesRunner {
//    5.
//    Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия) (через Stream.of())
//    Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву
//    Отфильтровать страны, в названии которых меньше 7 букв
//    Перевести все страны в верхний регистр
//    Добавить к каждому названию кавычки
//    Отпечатать в консоль с новой строки

    public static void main(String[] args) {

        Stream.of("Андора", "Португалия", "Англия", "Замбия")
                .filter(country -> country.matches(".*[аеёиоуыэюяАЕЁИОУЫЭЮЯ].*"))
                .filter(country -> country.length() < 7)
                .map(country -> country.toUpperCase())
                .map(country -> "\"" + country + "\"")
                .forEach(country -> System.out.println(country));
    }
}
