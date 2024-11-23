package homework.playground.essence.craft.field;

import homework.playground.essence.Matter;
import homework.playground.essence.craft.Transportable;

public class Vehicle extends Matter implements Transportable {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }
}
