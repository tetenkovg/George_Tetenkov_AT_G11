package homework.playground.processors;

import homework.playground.essence.craft.Transportable;
import homework.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {

    public void runTransportable (Transportable transportable, int pointA, int pointB){
        int coordinates = transportable.move(pointA,pointB);
        System.out.println("Transportable " + transportable.getClass().getSimpleName() +
                            " was moved from to " + coordinates +
                            " points");
    }

    public void runTransportable(Transportable transportable){
        int coordinates = transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate());
        System.out.println("Transportable " + transportable.getClass().getSimpleName() +
                " was moved from to " + coordinates +
                " points");
    }
}
