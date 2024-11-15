package homework.day3.playground.essence.craft.hand;

import homework.day3.playground.essence.Matter;

public class Container extends Matter {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Container(int mass, String name) {
        super(mass);
        this.name = name;
    }
}
