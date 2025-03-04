package selfstudy.udemy.collections.task.task2;

import java.util.Objects;

public class Student {

    private int id;

    private String name;

    private String lastName;

    private double avarageMark;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(avarageMark, student.avarageMark) == 0 && Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, avarageMark);
    }

    public Student(int id, String name, String lastName, double avarageMark) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.avarageMark = avarageMark;
    }

    public double getAvarageMark() {
        return avarageMark;
    }

    public void setAvarageMark(double avarageMark) {
        this.avarageMark = avarageMark;
    }

    public Student() {

    }

    public  int getId() {
        return id;
    }

    public String getFullName(){
        return getName() + " " + getLastName();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", avarageMark=" + avarageMark +
                '}';
    }

}
