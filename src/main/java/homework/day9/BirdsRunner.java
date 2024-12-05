package homework.day9;

import java.util.Arrays;
import java.util.List;


public class BirdsRunner {
//    6.
//    Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
//    Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
//    Собрать все слова в одну строку в ниждем регистре
//    Убрать все символы мягкого знака
//    Разбить на новые строки по букве "б"
//    Отпечатать в консоль с новой строки в виде --Чайка--

    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        Arrays.stream(
                birds.stream()
                    .map(bird -> bird.replace("о", "а"))
                    .map(bird -> bird.toLowerCase())
                    .reduce((s1, s2) -> s1 + s2)
                    .orElse("")
                    .replace("ь", "")
                .split("б")
        ).forEach(part -> System.out.println("--" + part + "--"));
    }
}

