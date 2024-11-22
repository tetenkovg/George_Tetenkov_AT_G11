package homework.playground.essence.craft.air;

import homework.playground.essence.Flyable;
import homework.playground.essence.craft.Transportable;

public class Copter extends Aircraft implements Flyable, Transportable {
    public Copter(int mass, String name) {
        super(mass, name);
    }

    @Override
    public String getName() {
        return super.name;
    }
}
