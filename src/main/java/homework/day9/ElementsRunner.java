package homework.day9;

import java.util.Arrays;
import java.util.stream.Stream;

public class ElementsRunner {

//    7.
//    Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb) (через Stream.of())
//    Для каждого элемента стрима пробежаться по отдельным словам и если слово нечетное, то заменить в нем все буквы "e" на букву "o", а если четное, то заменить слово на число количества буков в этом слове
//    Оставить в потоке только уникальные значения
//    Отпечатать в консоль с новой строки

        public static void main(String[] args) {
            Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb")
                    .flatMap(element -> Arrays.stream(element.split(" ")))
                    .map(word -> word.length() % 2 != 0
                            ? word.replace("e", "o")
                            : String.valueOf(word.length()))
                    .distinct()
                    .forEach(System.out::println);
        }

}


