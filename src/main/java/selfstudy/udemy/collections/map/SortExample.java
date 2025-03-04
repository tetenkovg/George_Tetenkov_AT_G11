package selfstudy.udemy.collections.map;

import selfstudy.udemy.collections.equalsandhashcode.PersonUdemy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "465", "789", "14");

        Collections.sort(strings);
        System.out.println(strings);

        List<PersonUdemy> personsList = Arrays.asList(
                new PersonUdemy(29, "Ivan", "Ivanov"),
                new PersonUdemy(2, "Petr", "Petrov"),
                new PersonUdemy(45, "Oveta", "Svetova")
        );


        System.out.println(personsList);

        personsList.sort(Comparator.comparing(x -> x.getId()));
        System.out.println(personsList);

        personsList.sort(Comparator.comparing(x -> x.getFirstName()));
        System.out.println(personsList);


    }

    public static class FirstNameComparator implements Comparator<PersonUdemy>{
        @Override
        public int compare(PersonUdemy o1, PersonUdemy o2){
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

}
