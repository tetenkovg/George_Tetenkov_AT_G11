package homework.playground.essence.material;

public class Petrol implements Pourable, Powerable{

    public Petrol(int i) {

    }

    @Override
    public void spread(String storeName) {
        System.out.println("I am Petrol and I am spreading in " + storeName);
        System.out.println("wheeh..");
    }
}
