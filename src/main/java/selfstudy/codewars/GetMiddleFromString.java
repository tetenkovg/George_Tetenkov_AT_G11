package selfstudy.codewars;

public class GetMiddleFromString {

    public static void main(String[] args) {

        String text = "test";

        System.out.println(getMiddle(text));

        System.out.println(text.length());
        System.out.println(text.length() / 2);

    }

    public static String getMiddle(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        return word.length() % 2 == 0 ?
                stringBuilder
                        .append(word.charAt((word.length() - 1) / 2))
                .append(word.charAt(((word.length() - 1) / 2) + 1))
                .toString() : stringBuilder.append(word.charAt((word.length() / 2) + 1)).toString();

    }
}
