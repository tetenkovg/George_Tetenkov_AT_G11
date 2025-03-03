package selfstudy.udemy.collections.map;

import io.cucumber.java.sl.In;
import selfstudy.udemy.collections.equalsandhashcode.PersonUdemy;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {


        PersonUdemy ivan = new PersonUdemy(1, "Ivan", "Ivanov");
        PersonUdemy petr = new PersonUdemy(3, "Petr", "Petrov");
        PersonUdemy sveta = new PersonUdemy(1, "sveta", "sveta");
        PersonUdemy sorok = new PersonUdemy(40, "sorok", "sorok");


        Map<Integer, PersonUdemy> map = new HashMap<>();

        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(sveta.getId(), sveta);
        map.put(sorok.getId(), sorok);


//        for (Integer integer : map.keySet()) {
//            System.out.println(map.get(integer));
//        }
//
//
//        for (int i = 0; i < map.size(); i++) {
//            System.out.println(map.containsKey(i));
//
//        }
//
//        System.out.println(map.entrySet());


        for(Map.Entry<Integer, PersonUdemy> entry : map.entrySet()){
            System.out.println(entry);
        }

        System.out.println(map.getOrDefault(6, sveta));
        System.out.println(map.size());
    }
}
