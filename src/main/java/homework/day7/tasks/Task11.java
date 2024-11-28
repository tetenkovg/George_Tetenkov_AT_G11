package homework.day7.tasks;

import project.Bubble;

import java.util.Arrays;
import java.util.List;

public class Task11 {
//    11.
//    Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5) и именами (CO2, O2, CO) соответственно, через (Arrays.asList())
//    Проитерировать список через for-each и отпечатать объемы в консоль через пробел
//    Проитерировать список через for-each и отпечатать имена в консоль через пробел
//    Посчитать объем всех пузырей и вывести число в консоль
//    Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки

    public static void main(String[] args) {

        List<Bubble> bubbles = Arrays.asList(
                new Bubble("CO2", 2),
                new Bubble("O2", 4),
                new Bubble("CO", 5));

        for (Bubble bubble : bubbles){
            System.out.print(bubble.getVolume() + " ");
        }

        System.out.println();

        for (Bubble bubble : bubbles){
            System.out.print(bubble.getName() + " ");
        }

        System.out.println();

        int countVolume = 0;

        for (Bubble bubble : bubbles){
            countVolume += bubble.getVolume();
        }
        System.out.println(countVolume);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }

    }
}
