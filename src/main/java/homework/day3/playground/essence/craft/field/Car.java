package homework.day3.playground.essence.craft.field;

import homework.day3.playground.essence.craft.Rideable;
import homework.day3.playground.essence.craft.Transportable;

public class Car extends Vehicle implements Transportable, Rideable {
    public Car(int mass, String name) {
        super(mass, name);
    }

}
