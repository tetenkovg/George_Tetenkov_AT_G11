package homework.playground.essence.craft.air;

import homework.playground.essence.Flyable;
import homework.playground.essence.craft.Transportable;

public class Rocket extends Aircraft implements Flyable, Transportable {
    public Rocket(int mass, String name) {
        super(mass, name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
