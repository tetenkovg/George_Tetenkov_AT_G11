package selfstudy.udemy.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {

    public static void main(String[] args) {

     List<Integer> integers = new ArrayList<>(5);

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        System.out.println(integers.size());


        integers.add(6);

        System.out.println(integers.size());



    }
}
