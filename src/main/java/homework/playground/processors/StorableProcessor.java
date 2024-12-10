package homework.playground.processors;

import homework.playground.essence.craft.hand.Storable;
import homework.playground.essence.material.Pourable;
import homework.playground.utils.VolumeGenerator;

public class StorableProcessor {
    public void runStorable(Storable storable, Pourable pourable) {
        int volume = VolumeGenerator.generateVolume(pourable);
        storable.store(pourable, volume);
    }

    public void runStorable(Storable storable, Pourable pourable, int volume) {
        storable.store(pourable, volume);
    }
}
