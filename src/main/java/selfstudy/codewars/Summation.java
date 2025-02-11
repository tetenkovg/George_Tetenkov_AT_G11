package selfstudy.codewars;

public class Summation {
    public static void main(String[] args) {


        System.out.println(summation(5));
    }

    public static int summation(int n){
        return  n == 1 ? 1 : n + summation(n-1);
    }


}
