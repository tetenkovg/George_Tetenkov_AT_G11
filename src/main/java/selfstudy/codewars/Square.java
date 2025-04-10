package selfstudy.codewars;

import io.cucumber.java.it.Ma;

public class Square {

    public static boolean isSquare(int n) {
        if (n < 0) {
            return false;
        }
        int b = ((int) Math.sqrt(n));
        return (b * b == n) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(25));
    }
}
