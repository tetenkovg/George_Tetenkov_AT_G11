package homework.day3.stringstask;

import java.time.LocalDateTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        currentDateTime();
    }

    public static void currentDateTime(){
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("Right now it is %d %s, %d, %d hours %d minutes",
                now.getDayOfMonth(),
                now.getMonth().toString().toLowerCase(),
                now.getYear(),
                now.getHour(),
                now.getMinute());
    }
}
