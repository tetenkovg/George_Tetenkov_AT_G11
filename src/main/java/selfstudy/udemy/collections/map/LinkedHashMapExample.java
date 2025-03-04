package selfstudy.udemy.collections.map;

import classwork.day9.Person;
import selfstudy.udemy.collections.equalsandhashcode.PersonUdemy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        PersonUdemy ivan = new PersonUdemy(1, "Ivan", "Ivanov");
        PersonUdemy petr = new PersonUdemy(2, "Petr", "Petrov");
        PersonUdemy sveta = new PersonUdemy(3, "sveta", "sveta");
        PersonUdemy sorok = new PersonUdemy(4, "sorok", "sorok");


        Map<Integer, PersonUdemy> map = new LinkedHashMap<>();

        map.put(ivan.getId(), ivan);
        map.put(sveta.getId(), sveta);
        map.put(petr.getId(), petr);
        map.put(sorok.getId(), sorok);


        for (Map.Entry<Integer, PersonUdemy> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }


    }
}

