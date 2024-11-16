package homework.day3.playground.essence.craft.air;

import homework.day3.playground.essence.Flyable;
import homework.day3.playground.essence.craft.Transportable;

public class Copter extends Aircraft implements Flyable, Transportable {

    public Copter(int mass, String name) {
        super(mass, name);
    }

}
