package homework.playground.essence.craft;

public interface Rideable {
    String getName();

    default void drive(String direction) {
        System.out.println("I am " + getClass().getSimpleName() +
                " my name is " +
                this.getName() +
                " and i am driving to " +
                direction);
    }
}
