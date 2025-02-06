package codewars;

public class StringMover {

    public static void main(String[] args) {

        String text = ":((((:(::((:(((";

        System.out.println(stringer(text));

    }

    public static String stringer (String text){
        return text.replace(":(", ":)");
    }
}
