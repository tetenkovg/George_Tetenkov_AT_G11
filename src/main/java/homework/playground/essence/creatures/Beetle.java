package homework.playground.essence.creatures;

import homework.playground.essence.plants.Carrot;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest (Carrot home){
        if (this.getMass() < home.getMass()){
            int familyMembers = home.getMass() / this.getMass();
            System.out.printf("I am %s I will nest there with %d my family members!", name, familyMembers);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}
