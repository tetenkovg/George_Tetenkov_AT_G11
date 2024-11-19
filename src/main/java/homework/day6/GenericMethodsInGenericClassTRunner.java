package homework.day6;

import homework.day3.playground.essence.Flyable;
import homework.day3.playground.essence.Matter;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassT <String> stringObject = new  GenericMethodsInGenericClassT <>();
        GenericMethodsInGenericClassT <Integer> integerObjecct = new  GenericMethodsInGenericClassT <>();
        GenericMethodsInGenericClassT <Double> doubleObject = new  GenericMethodsInGenericClassT <>();
        GenericMethodsInGenericClassT <Matter> matterObject = new  GenericMethodsInGenericClassT <>();
        GenericMethodsInGenericClassT <Flyable> flyableObject = new  GenericMethodsInGenericClassT <>();

    }
}
