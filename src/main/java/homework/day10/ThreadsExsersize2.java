package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadsExsersize2 {
    public static void main(String[] args) {
        List<Mouse> mice = new ArrayList<>();
        for (int i = 1; i <= 18; i++) {
            mice.add(new Mouse(i));
        }


        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                for (int j = 0; j < mice.size(); j++) {
                    if ((j + 1) % 2 == 0) {
                        try {
                            mice.get(j).peep();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }).start();
        }
    }
}

