package homework.day7.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task8 {

    public static void main(String[] args) {

        /*
        Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())
        Проитерировать список через for-each и отпечатать числа в консоль новой строки
        Посчитать сумму всех чисел и вывести результат в консоль
        Отсортировать список по возрастанию
        Проитерировать список по индексу и отпечатать числа в консоль через пробел
        Развернуть список в обратном порядке
        Проитерировать список через for-each и отпечатать числа в консоль через пробел
         */

        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        int counter = 0;
        for(int number : numbers){
            System.out.println(number);
            counter += number;
        }
        System.out.println("The sum is : " + counter);

        Collections.sort(numbers);

        for (int number : numbers){
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("================");

        Collections.reverse(numbers);

        for (int number : numbers){
            System.out.print(number + " ");
        }

    }
}
