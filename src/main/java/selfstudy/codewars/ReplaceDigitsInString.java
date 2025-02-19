package selfstudy.codewars;

public class ReplaceDigitsInString {
    public static void main(String[] args) {

        System.out.println(fakeBin("31232131293412420198412"));

    }

    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-5]","0").replaceAll("[6-9]", "1");
    }
}
