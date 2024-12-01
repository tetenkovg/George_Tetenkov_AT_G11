package homework.day7.tasks;

import homework.day7.utils.Fruits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task17 {

    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<>();

        fruits.add(new Fruits("Яблоко", 120));
        fruits.add(new Fruits("Банан", 80));
        fruits.add(new Fruits("Груша", 150));
        fruits.add(new Fruits("Апельсин", 200));

        for (Fruits fruit : fruits){
            System.out.print(fruit.getName() + " ");
        }
        System.out.println();
        for (Fruits fruit : fruits){
            System.out.print(fruit.getWeight() + " ");
        }

        HashMap<Integer, Fruits> map = new HashMap<>();

        for (int i = 0; i < fruits.size(); i++) {
            map.put(i+1, fruits.get(i));
        }

        for (Map.Entry<Integer, Fruits> fuit : map.entrySet()){
            System.out.println(fuit.getKey() + " ");
        }
        System.out.println();
        for (Map.Entry<Integer, Fruits> fuit : map.entrySet()){
            System.out.print(fuit.getValue() + " ");
        }
        System.out.println();
        for (Map.Entry<Integer, Fruits> fuit : map.entrySet()){
            System.out.print("Ключ и значение " +  fuit.getKey().toString()+ " " + fuit.getValue().toString() + " ");
        }
    }
}
