package homework.playground.essence.craft.air;

import homework.playground.essence.Flyable;
import homework.playground.essence.Matter;

public class Aircraft extends Matter implements Flyable {
    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }
}
