package homework.playground.essence;

public interface Flyable {

    String getName();

    default void fly(String direction){
        System.out.println("I am " + getClass().getSimpleName() +
                            ", my name is "+ this.getName() +
                            " and I am flying to " + direction);
    }

}
