package homework.day7.tasks;

import homework.day7.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Task18 {
    public static void main(String[] args) {

        List<Cars> cars = new ArrayList<>();

        cars.add(new Cars("Toyota", "Corolla"));
        cars.add(new Cars("Ford", "Mustang"));
        cars.add(new Cars("BMW", "X5"));

        for (Cars car : cars){
            System.out.println(car.getBrand() + ": " + car.getModel());
        }


        HashMap<String, Cars> map = new HashMap<>();

        for (int i = 0; i < cars.size(); i++) {
            map.put(cars.get(i).getBrand(), cars.get(i));
        }

        System.out.println();
        System.out.println("==============");

        for (Map.Entry<String, Cars> entry : map.entrySet()){
            System.out.print(entry.getKey().toString() + " ");
        }
        System.out.println();
        System.out.println("==============");
        for (Map.Entry<String, Cars> entry : map.entrySet()){
            System.out.print(entry.getValue().toString() + " ");
        }
        System.out.println();
        System.out.println("==============");
        for (Map.Entry<String, Cars> entry : map.entrySet()){
            System.out.println("Ключ Значение " + entry.getKey().toString() + " " +  entry.getValue().toString());
        }




    }
}
