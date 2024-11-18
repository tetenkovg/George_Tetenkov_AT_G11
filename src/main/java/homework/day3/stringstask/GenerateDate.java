package homework.day3.stringstask;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GenerateDate {
    public static void main(String[] args) {
        generateDate("Hello");
    }

    public static void generateDate(String text){
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(vowels.indexOf(c) >= 0){
                vowelCount++;
            }
        }

        LocalDate newdate = LocalDate.now().plusDays(vowelCount);

        System.out.printf("New date is " + newdate.getDayOfMonth() + " " + newdate.getMonth().toString().toLowerCase()+ ".");

    }
}
