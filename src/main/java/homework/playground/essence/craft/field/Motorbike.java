package homework.playground.essence.craft.field;

import homework.playground.essence.craft.Rideable;
import homework.playground.essence.craft.Transportable;

public class Motorbike extends Vehicle implements Transportable, Rideable {
    public Motorbike(int mass, String name) {
        super(mass, name);
    }
}
