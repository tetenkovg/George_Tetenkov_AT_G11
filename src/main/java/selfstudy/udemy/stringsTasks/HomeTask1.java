package selfstudy.udemy.stringsTasks;

public class HomeTask1 {

    public static void main(String[] args) {
        String text = "111";

        System.out.println(isItAPolindrome(text));


    }

    public static Boolean isItAPolindrome(String text) {
        for (int i = 0; i <= text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
