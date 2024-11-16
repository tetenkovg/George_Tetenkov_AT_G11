package homework.day3.playground.essence.craft.air;

import homework.day3.playground.essence.Matter;

public class Aircraft extends Matter {
    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }


}
