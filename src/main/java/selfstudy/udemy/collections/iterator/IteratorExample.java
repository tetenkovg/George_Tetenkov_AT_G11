package selfstudy.udemy.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<>();

        sourceList.add("1");
        sourceList.add("2");
        sourceList.add("3");
        sourceList.add("4");


        for(String a : sourceList){
            System.out.println(a);

        }

        sourceList.forEach(x -> System.out.println(x));
    }
}
