package homework.day3.playground.essence.craft.air;

import homework.day3.playground.essence.Flyable;
import homework.day3.playground.essence.craft.Transportable;

import java.sql.SQLOutput;

public class Plane extends Aircraft implements Flyable, Transportable {
    public Plane(int mass, String name) {
        super(mass, name);
    }

}
