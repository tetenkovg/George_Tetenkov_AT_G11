package homework.playground.essence.craft.field;

import homework.playground.essence.craft.Rideable;
import homework.playground.essence.craft.Transportable;

public class Moped extends Vehicle implements Transportable, Rideable {
    public Moped(int mass, String name) {
        super(mass, name);
    }
}
