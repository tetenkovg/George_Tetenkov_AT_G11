package selfstudy.udemy.collections.task.task2;

import selfstudy.udemy.collections.task.task2.sorters.AvarageMarkComparator;
import selfstudy.udemy.collections.task.task2.sorters.FullNameComparator;
import selfstudy.udemy.collections.task.task2.sorters.IdComparator;

import java.util.*;

import static selfstudy.udemy.collections.task.task2.BestStundet.findMaxId;

public class StudentRunner {
    public static void main(String[] args) {
        Student petia = new Student(1, "pet", "ivanov", 2.8);
        Student sveta = new Student(3, "Svet", "Svetova", 4);
        Student mark = new Student(9, "Mark", "Markov", 5.5);
        Student shulik = new Student(8, "Shul", "Shulik", 5.4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(petia);
        studentList.add(sveta);
        studentList.add(mark);
        studentList.add(shulik);

        studentList.sort(new FullNameComparator());
        System.out.println(studentList);
        System.out.println();

        studentList.sort(new IdComparator());
        System.out.println(studentList);
        System.out.println();

        studentList.sort(new AvarageMarkComparator());
        System.out.println(studentList);
        System.out.println();


        System.out.println(findMaxId(studentList));


    }

}
