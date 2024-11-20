package homework.playground.essence.craft.air;

import homework.playground.essence.Matter;

public class Aircraft extends Matter {
    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }


}
