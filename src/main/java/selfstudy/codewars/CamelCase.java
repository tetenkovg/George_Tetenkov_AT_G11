package selfstudy.codewars;

public class CamelCase {

    public static void main(String[] args) {

        String text = "camelCase";

        System.out.println(camelCase(text));

    }

    public static String camelCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                stringBuilder.append(" ").append(input.charAt(i));
            } else {
                stringBuilder.append(input.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
