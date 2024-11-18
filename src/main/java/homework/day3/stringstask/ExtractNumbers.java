package homework.day3.stringstask;

public class ExtractNumbers {
    public static void main(String[] args) {

        String text = "I have 2 nice cat, but and 3 nice dogs";

        extractNumbers(text);

    }

    public static void extractNumbers(String text){
        for (char c : text.toCharArray()){
            if (Character.isDigit(c)){
                System.out.println(c);
            }
        }

    }
}
