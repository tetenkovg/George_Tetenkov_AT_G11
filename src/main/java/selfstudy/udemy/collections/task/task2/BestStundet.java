package selfstudy.udemy.collections.task.task2;

import selfstudy.udemy.collections.task.task2.Student;

import java.util.List;

public class BestStundet {

    public static Student findMaxId(List<Student> list) {

        Student studentWithMaxAvg = null;


        for (Student student : list) {
            if (studentWithMaxAvg == null || studentWithMaxAvg.getAvarageMark() < student.getAvarageMark()) {
                studentWithMaxAvg = student;
            }
        }
        return studentWithMaxAvg;
    }
}
