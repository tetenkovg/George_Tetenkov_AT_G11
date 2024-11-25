package homework.day7.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {


        List<String> cars = new ArrayList<>();


        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        for (String car : cars){
            if (car.length() > 3){
                cars.remove(car);
            }
        }

        for (String car : cars){
            System.out.print(car + " ");
        }

    }
}
