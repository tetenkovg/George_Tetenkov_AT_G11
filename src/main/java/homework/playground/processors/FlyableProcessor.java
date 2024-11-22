package homework.playground.processors;

import homework.playground.essence.Flyable;
import homework.playground.utils.DirectionGenerator;

public class FlyableProcessor {

    public void runFlyable(Flyable flyable){
        String direction = DirectionGenerator.generateDirection();
        flyable.fly(direction);

    }

    public void runFlyable(Flyable flyable, String direction){
        flyable.fly(direction);
    }
}
