package selfstudy.udemy.collections.task.task2;

import java.util.List;

public class BestStudent {

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
