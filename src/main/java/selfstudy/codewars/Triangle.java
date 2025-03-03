package selfstudy.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {

    public static void main(String[] args) {
        System.out.println(isTriangle(-1, 2, 3));
    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && c + b > a;
    }
}
