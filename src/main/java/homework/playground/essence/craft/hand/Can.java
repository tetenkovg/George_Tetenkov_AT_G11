package homework.playground.essence.craft.hand;

import homework.playground.essence.material.Pourable;

public class Can extends Container implements Storable{
    public Can(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void store(Pourable pourable, int amount) {
        Storable.super.store(pourable, amount);

        if (amount > this.getMass()){
            System.out.println("waah-waah-waah-hh..");
        }
    }
}
