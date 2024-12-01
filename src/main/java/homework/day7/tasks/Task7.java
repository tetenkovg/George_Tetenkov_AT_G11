package homework.day7.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task7 {

    /*
    7.
    Создать пустой список стрингов elements (через new ArrayList)
    Добавить в список 6 элементов (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
    Проитерировать список через for-each и отпечатать слова в консоль через пробел
    Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
    Проитерировать список по индексу и отпечатать слова в консоль через пробел
    На 4-ю позицию добавить Spinner
    Удалить 2-й элемент списка
    Заменить 5-й элемент на Switch
    Проитерировать список через for-each и отпечатать слова в консоль через пробел*/


    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();

        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        System.out.println("======================");
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("======================");

        int counter  = 0;

        for (String element : elements){
            String[] words = element.split("[ \\-]");

            int wordCounter = 0;

            for (int i = 0; i < words.length; i++) {
                wordCounter++;
            }

            if (wordCounter > 1){
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println("======================");

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }

        System.out.println();

        elements.add(4, "Spinner");
        elements.remove(1);
        elements.set(4, "Switch");

        System.out.println("======================");

        for (String element : elements){
            System.out.print(element + " ");
        }







    }
}
