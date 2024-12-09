package homework.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable{
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void crawl(String directions, int distance) {
        Crawlable.super.crawl(directions, distance);
        System.out.println("wr-wr-wrr-r...");
    }
}
