package homework.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Stream.of())
// Заменить каждое слово на целое число, соответствующее количеству буков в слове
// Отфильтровать числа, которые больше 4
//Отпечатать все оставшиеся числа в консоль

public class FiguresRunner {
    public static void main(String[] args) {
       Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс")
                .map(f -> f.length())
                .filter(f ->  f >  4)
                .forEach(f -> System.out.println(f));

    }
}
