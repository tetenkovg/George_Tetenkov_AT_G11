package tests.classwork.day21.classcheck;

public class Cat extends Animal{

    @Override
    void move(){
        System.out.println("Tsss");
    }

    @Override
    void makeSound(){
        System.out.println("Mur");
    }
}
