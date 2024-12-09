package homework.day10;

import static java.lang.Thread.sleep;

public class Mouse {
    private String pattern;

    private String name;

    public Mouse(int number) {
        this.pattern = "Mouse" + number;
        this.name = "Mouse" + number;
    }

    public void peep() throws InterruptedException {
        System.out.println(this.name + " PEEP!" );
        sleep(200);

    }}
