package homework.playground.essence.craft.air;

import homework.playground.essence.Flyable;
import homework.playground.essence.craft.Transportable;

public class Plane extends Aircraft implements Flyable, Transportable {
    public Plane(int mass, String name) {
        super(mass, name);
    }

}
