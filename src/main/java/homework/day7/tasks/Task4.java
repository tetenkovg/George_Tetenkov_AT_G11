package homework.day7.tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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


        String file = "cars.txt";

        try{
            BufferedWriter write = new BufferedWriter(new FileWriter(file));
            StringBuilder stringBuilder = new StringBuilder();


            for (String car : cars){
                stringBuilder.append("\"" + car + "\"" );
            }
            write.write(stringBuilder.toString());
            write.close();
            System.out.println("Записал");
        } catch (IOException e){
           e.printStackTrace();
        }

        List<String> filterCars = new ArrayList<>();
        for (String car : cars){
            if (car.length() <= 4){
                filterCars.add(car);
            }
        }
        cars = filterCars;

        for (String car : cars){
            System.out.print(car + " ");
        }

    }
}
