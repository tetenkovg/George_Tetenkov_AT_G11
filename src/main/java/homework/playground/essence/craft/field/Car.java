package homework.playground.essence.craft.field;

import homework.playground.essence.craft.Rideable;
import homework.playground.essence.craft.Transportable;

public class Car extends Vehicle implements Transportable, Rideable {
    public Car(int mass, String name) {
        super(mass, name);
    }

}
