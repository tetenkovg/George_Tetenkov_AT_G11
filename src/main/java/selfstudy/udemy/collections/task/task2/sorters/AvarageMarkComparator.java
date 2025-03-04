package selfstudy.udemy.collections.task.task2.sorters;

import selfstudy.udemy.collections.task.task2.Student;

import java.util.Comparator;

public class AvarageMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAvarageMark(), o2.getAvarageMark());
    }
}
