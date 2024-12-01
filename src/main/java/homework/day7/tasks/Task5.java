package homework.day7.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    /*
    5.
Создать пустой список стрингов countries (через new ArrayList)
Добавить в список 4 страны (Андора, Португалия, Англия, Замбия)
Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом
Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль
Проитерировать список по индексу и отпечатать слова в консоль с новой строки
*/

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("Андора");
        strings.add("Португалия");
        strings.add("Англия");
        strings.add("Замбия");

        for (String country : strings){
            System.out.printf("%s, ", country);
        }
        System.out.println();

        int count = 0;
        for (String country : strings){
            if(country.length() < 7){
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }



    }

}
