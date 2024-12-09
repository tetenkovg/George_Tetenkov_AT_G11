package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadsExersize {

    public static void main(String[] args) {
        List<Mouse> mice = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            mice.add(new Mouse(i));
        }

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (Mouse mouse : mice) {
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
