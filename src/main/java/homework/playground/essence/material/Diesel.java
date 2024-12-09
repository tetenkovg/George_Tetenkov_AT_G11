package homework.playground.essence.material;

public class Diesel implements Pourable, Powerable {

    public Diesel(int i) {
    }

    @Override
    public void spread(String storeName) {
        System.out.println("I am Diesel and I am spreading in " + storeName);
        System.out.println("whooh..");
    }
}
