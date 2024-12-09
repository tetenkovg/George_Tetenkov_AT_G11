package homework.playground.essence.creatures;

public interface Crawlable {
    String getName();

    default void crawl (String directions, int distance){
        System.out.println("I am " +
                this.getClass().getSimpleName() +
                ", my name is " + this.getName() +
                " and I am crawling to " + directions +
                " for " + distance + " units");
    }
}
