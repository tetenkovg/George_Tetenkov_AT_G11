package classwork.day9;

import java.util.Arrays;
import java.util.List;

import static classwork.day9.Person.Sex.MAN;
import static classwork.day9.Person.Sex.WOMEN;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Вася", 13, MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, MAN));

        long workable = 0;
        for (Person person : persons){
            if (person.sex.equals(MAN) && person.age >= 18 && person.age <= 60){
                workable++;
            } else if (person.sex.equals(WOMEN) && person.age >= 18 && person.age <= 55){
                workable++;
            }
        }

        System.out.println(workable);

         long workableStream = persons.stream().filter(person ->
                (person.sex.equals(MAN) && person.age >= 18 && person.age <= 60) ||
                (person.sex.equals(WOMEN) && person.age >= 18 && person.age <= 55)).
                count();

        System.out.println(workableStream);
    }
}

