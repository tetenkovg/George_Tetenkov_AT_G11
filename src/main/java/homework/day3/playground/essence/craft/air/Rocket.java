package homework.day3.playground.essence.craft.air;

import homework.day3.playground.essence.Flyable;
import homework.day3.playground.essence.craft.Transportable;

public class Rocket extends Aircraft implements Flyable, Transportable {
    public Rocket(int mass, String name) {
        super(mass, name);
    }

}
