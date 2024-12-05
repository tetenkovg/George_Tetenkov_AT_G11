package homework.playground.processors;

import homework.playground.essence.craft.Rideable;

import static homework.playground.utils.DirectionGenerator.generateDirection;

public class RiadableProcessor {
    public void runRiadable(Rideable riadable){
        riadable.drive(generateDirection());
    }
    public void runRuadeable (Rideable rideable, String string){
        rideable.drive(string);
    }
}
