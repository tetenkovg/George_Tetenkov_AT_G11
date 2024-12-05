package homework.day9;

import homework.day7.utils.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubblesRunner {
//    Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5) и именами (CO2, O2, CO) соответственно, через (Arrays.asList())
//    В потоке данных отфельтровать только те пузыри, обьем которых больше 3
//    Отсортировать данные по имени в восходящем порядке
//    На основании существующего потока данных создать новый, в котором каждый новый Bubble имеет обьем в 3 раза больше исходного
//    Вычислить сумму конечного обьема всех пузырей и отпечатать в консоль

    public static void main(String[] args) {

        List<Bubble> bubbles = Arrays.asList(
                new Bubble("CO2", 2),
                new Bubble("O2", 4),
                new Bubble("CO", 5));

        int bubblesSum = bubbles.stream()
                .filter(bubble -> bubble.getVolume() > 3)
                .sorted((a, b) -> b.getName().compareTo(a.getName()))
                .map(bubble -> new Bubble(bubble.getName(), bubble.getVolume() * 3))
                .mapToInt(bubble -> bubble.getVolume())
                .sum();

        System.out.println(bubblesSum);
    }
}
