package homework.day3.playground.essence.craft.field;

import homework.day3.playground.essence.craft.Rideable;
import homework.day3.playground.essence.craft.Transportable;

public class Moped extends Vehicle implements Transportable, Rideable {
    public Moped(int mass, String name) {
        super(mass, name);
    }
}
