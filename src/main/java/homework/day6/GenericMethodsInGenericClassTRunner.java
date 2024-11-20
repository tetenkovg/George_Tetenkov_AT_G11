package homework.day6;

import homework.playground.essence.Matter;
import homework.playground.essence.craft.air.Aircraft;
import homework.playground.essence.craft.air.Copter;
import homework.playground.essence.craft.air.Plane;
import homework.playground.essence.craft.air.Rocket;
import homework.playground.essence.craft.field.Car;
import homework.playground.essence.craft.field.Vehicle;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> stringObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> integerObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleObject = new GenericMethodsInGenericClassT<>();


        GenericMethodsInGenericClassT<Matter> matterObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Aircraft> aircraftObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> copterObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plane> planeObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> rocketObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vehicle> vehicleObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> carObject = new GenericMethodsInGenericClassT<>();


        String text = "Hello";
        Integer number = 123;
        Double decimal = 45.67;
        Matter matter = new Aircraft(100, "Generic Matter");
        Aircraft aircraft = new Aircraft(2000, "Generic Aircraft");
        Copter copter = new Copter(1500, "Helicopter");
        Plane plane = new Plane(3000, "Jet");
        Rocket rocket = new Rocket(5000, "SpaceX");
        Vehicle vehicle = new Vehicle(2000, "Generic Vehicle");
        Car car = new Car(3000, "ЛАДА СЕДАН, баклажан");


        System.out.println("--- String ---");
        stringObject.genericMethodOneGenArg(text);
        stringObject.genericMethodTwoGenArgs(text, "World");
        stringObject.genericMethodHalfGenArgs(text, "String Example");

        System.out.println("\n--- Integer ---");
        integerObject.genericMethodOneGenArg(number);
        integerObject.genericMethodTwoGenArgs(number, 456);
        integerObject.genericMethodHalfGenArgs(number, "Number Example");

        System.out.println("\n--- Double ---");
        doubleObject.genericMethodOneGenArg(decimal);
        doubleObject.genericMethodTwoGenArgs(decimal, 78.9);
        doubleObject.genericMethodHalfGenArgs(decimal, "Decimal Example");

        System.out.println("\n--- Matter ---");
        matterObject.genericMethodOneGenArg(matter);
        matterObject.genericMethodTwoGenArgs(matter, matter);
        matterObject.genericMethodHalfGenArgs(matter, "Physics");

        System.out.println("\n--- Aircraft ---");
        aircraftObject.genericMethodOneGenArg(aircraft);
        aircraftObject.genericMethodTwoGenArgs(aircraft, aircraft);
        aircraftObject.genericMethodHalfGenArgs(aircraft, "Flying");

        System.out.println("\n--- Copter ---");
        copterObject.genericMethodOneGenArg(copter);
        copterObject.genericMethodTwoGenArgs(copter, copter);
        copterObject.genericMethodHalfGenArgs(copter, "Chopper");

        System.out.println("\n--- Plane ---");
        planeObject.genericMethodOneGenArg(plane);
        planeObject.genericMethodTwoGenArgs(plane, plane);
        planeObject.genericMethodHalfGenArgs(plane, "Aircraft");

        System.out.println("\n--- Rocket ---");
        rocketObject.genericMethodOneGenArg(rocket);
        rocketObject.genericMethodTwoGenArgs(rocket, rocket);
        rocketObject.genericMethodHalfGenArgs(rocket, "Spacecraft");

        System.out.println("\n--- Vehicle ---");
        vehicleObject.genericMethodOneGenArg(vehicle);
        vehicleObject.genericMethodTwoGenArgs(vehicle, vehicle);
        vehicleObject.genericMethodHalfGenArgs(vehicle, "Vehicle");

        System.out.println("\n--- Car ---");
        carObject.genericMethodOneGenArg(car);
        carObject.genericMethodTwoGenArgs(car, car);
        carObject.genericMethodHalfGenArgs(car, "Время расстаться с вестой");
    }
}
