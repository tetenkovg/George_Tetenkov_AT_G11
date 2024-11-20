package homework.day6;

import homework.playground.essence.Matter;
import homework.playground.essence.craft.air.Aircraft;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams<String, String> stringStringObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> stringIntegerObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> stringDoubleObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> integerIntegerObject = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Matter, Aircraft> matterAircraftObject = new GenericMethodsInGenericClassTwoParams<>();



        String text = "Hello";
        Integer number = 123;
        Double decimal = 45.67;
        Matter matter = new Matter(100) {};
        Matter matterAir = new Aircraft(2000, "Generic Matter From Air");
        Aircraft aircraft = new Aircraft(2000, "Generic AirCarft");



        System.out.println("\n--- String, String ---");
        stringStringObject.genericMethodGenArgs(text);
        stringStringObject.genericMethodGenArgs(text, "World");
        stringStringObject.genericMethodHalfGenArgs(text, "Example String");
        stringStringObject.genericMethodHalfGenArgs("Another String", text, "Two Texts Test");

        System.out.println("\n--- String, Integer ---");
        stringIntegerObject.genericMethodGenArgs(text);
        stringIntegerObject.genericMethodGenArgs(text, number);
        stringIntegerObject.genericMethodHalfGenArgs(text, "Example Text");
        stringIntegerObject.genericMethodHalfGenArgs(text, 12, "Text and Integer Text");

        System.out.println("\n--- String, Double ---");
        stringDoubleObject.genericMethodGenArgs(text);
        stringDoubleObject.genericMethodGenArgs(text, decimal);
        stringDoubleObject.genericMethodHalfGenArgs(text, "Decimal Text");
        stringDoubleObject.genericMethodHalfGenArgs(text,decimal, "Two Decimal Text");

        System.out.println("\n--- Integer, Integer ---");
        integerIntegerObject.genericMethodGenArgs(number);
        integerIntegerObject.genericMethodGenArgs(number, number);
        integerIntegerObject.genericMethodHalfGenArgs(number, "Integer Text");
        integerIntegerObject.genericMethodHalfGenArgs(number, number, "Two Integer Text");

        System.out.println("\n--- Matter, Aircarft ---");
        matterAircraftObject.genericMethodGenArgs(matter);
        matterAircraftObject.genericMethodGenArgs(matter, aircraft);
        matterAircraftObject.genericMethodGenArgs(matterAir);
        matterAircraftObject.genericMethodGenArgs(matterAir, aircraft);
        matterAircraftObject.genericMethodHalfGenArgs(matter, "Matter Text");
        matterAircraftObject.genericMethodHalfGenArgs(matterAir, "Matter  Air Text");
        matterAircraftObject.genericMethodHalfGenArgs(matter, aircraft,"Matter and  Air text");
        matterAircraftObject.genericMethodHalfGenArgs(matterAir, aircraft,"Matter Air and  Air text");








    }
}
