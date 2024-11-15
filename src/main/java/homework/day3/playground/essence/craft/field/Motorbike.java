package homework.day3.playground.essence.craft.field;

import homework.day3.playground.essence.craft.Rideable;
import homework.day3.playground.essence.craft.Transportable;

public class Motorbike extends Vehicle implements Transportable, Rideable {
    public Motorbike(int mass, String name) {
        super(mass, name);
    }
}
