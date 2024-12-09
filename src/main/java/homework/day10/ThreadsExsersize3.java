package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadsExsersize3 {

    public static void main(String[] args) {
        List<Mouse> mice = new ArrayList<>();
        for (int i = 1; i <= 280; i++) {
            mice.add(new Mouse(i));
        }

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                while (!mice.isEmpty()) {
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
