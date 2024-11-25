package homework.day7.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

    int count = 0;

    for (String fig : figures){
        if(!fig.toLowerCase().contains("-"));
        count++;
    }
        System.out.println("Вот сколько фигур не содержат - :" + count);


        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i));
            System.out.print(" ");
        }


        figures = new ArrayList<>(figures);
        figures.add(2, "Треугольник");

        System.out.println();
        for (String figure : figures) {
            System.out.print(figure + " ");
        }


    }
}
