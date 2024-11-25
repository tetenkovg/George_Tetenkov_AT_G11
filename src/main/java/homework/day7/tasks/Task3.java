package homework.day7.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {


        List<String> array = new ArrayList<>();

        array.add("Минск");
        array.add("Москва");
        array.add("Берлин");

        int counter = 0;
        for (String city : array){
            for (int i = 0; i < city.length(); i++) {
                counter++;
            }
        }
        System.out.println(counter);

        for (String city : array){
            System.out.println(city);
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");

        }


    }
}
