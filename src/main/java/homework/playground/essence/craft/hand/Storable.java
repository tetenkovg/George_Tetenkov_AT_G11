package homework.playground.essence.craft.hand;

import homework.playground.essence.material.Pourable;

public interface Storable {


    String getName();


    default void store(Pourable pourable, int amount) {
        pourable.spread(this.getName());
        System.out.println("I am " + this.getClass().getSimpleName() +
                ", my name is " + getName() +
                " and I received " + amount + " of " + pourable.getClass().getSimpleName());
    }

}


