package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadsExsersize4 {
    public static void main(String[] args) {
        List<Mouse> mice = new ArrayList<>();
        for (int i = 1; i <= 380; i++) {
            mice.add(new Mouse(i));
        }


        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                while (!mice.isEmpty()) {
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Mouse mouse = mice.remove(0);
                    try {
                        mouse.peep();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
    }
}
