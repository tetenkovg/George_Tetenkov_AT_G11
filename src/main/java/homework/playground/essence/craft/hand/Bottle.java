package homework.playground.essence.craft.hand;

import homework.playground.essence.material.Pourable;

public class Bottle extends Container implements Storable {
    public Bottle(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void store(Pourable pourable, int amount) {
        Storable.super.store(pourable, amount);

        if (amount > this.getMass()) {
            System.out.println("wooh-wooh-wooh-hh..");

        }
    }
}
