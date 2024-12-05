package homework.playground.essence.craft;

public interface Transportable {

    String getName();


    default int move(int pointA, int pointB) {
        System.out.println("I am " + getClass().getSimpleName() +
                ", my name is " + this.getName() +
                " and I am moviing form " + pointA +
                " to " + pointB);
        return pointB - pointA;
    }


}
