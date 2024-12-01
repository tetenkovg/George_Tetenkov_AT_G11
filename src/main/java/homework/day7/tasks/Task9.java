package homework.day7.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task9 {

    public static void main(String[] args) {

        /*
        Создать список дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Arrays.asList())
        Проитерировать список через for-each и отпечатать числа в консоль через пробел
        Посчитать произведение всех чисел и вывести результат в консоль
        найти сумму всех дробных частей и вывести результат в консоль
        Проитерировать список по индексу и вывести целые части в консоль через пробел
        */

        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        double proizvedeinie = 1;
        double fractionalSum = 0.0;

        for (double doub : doubles){
            proizvedeinie *= doub;
            double fractionalPart = doub - Math.floor(doub);
            fractionalSum += fractionalPart;


        }
        System.out.println(proizvedeinie);
        System.out.println(fractionalSum);

        for (int i = 0; i < doubles.size(); i++) {
            int ingeterPart = (int) Math.floor(doubles.get(i));
            System.out.print(ingeterPart + " ");
        }


    }
}
