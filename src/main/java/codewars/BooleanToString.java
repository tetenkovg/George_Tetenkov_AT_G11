package codewars;

public class BooleanToString {

    public static void main(String[] args) {


        System.out.println(convert(false));
    }

    public static String convert(boolean b) {
        return b== true? "True": "False";
    }
}
