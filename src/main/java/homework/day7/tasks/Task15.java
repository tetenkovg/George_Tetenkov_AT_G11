package homework.day7.tasks;
import homework.day7.utils.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task15 {
    public static void main(String[] args) {

        List<Chair> furniture = Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4)
        );

        for (Chair chair : furniture) {
            int area = chair.getHeight() * chair.getWidth();
            System.out.print(area + " ");
        }
        System.out.println();


        Map<Integer, Chair> chairMap = new HashMap<>();

        chairMap.put(1, furniture.get(0));
        chairMap.put(2, furniture.get(1));
        chairMap.put(3, furniture.get(2));


        for (Integer key : chairMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        for (Chair chair : chairMap.values()) {
            System.out.println(chair);
        }

        for (Map.Entry<Integer, Chair> entry : chairMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }

}
