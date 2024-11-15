package homework.day3.playground.essence.craft.field;

import homework.day3.playground.essence.Matter;

public class Vehicle extends Matter {
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
