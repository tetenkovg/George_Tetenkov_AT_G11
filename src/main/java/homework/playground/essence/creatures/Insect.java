package homework.playground.essence.creatures;

import homework.playground.essence.Flyable;

public abstract class Insect extends Animal implements Flyable {
    public Insect(int mass, String name) {
        super(mass, name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
