package codewars;

//Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.
//
//        Note: a and b are not ordered!
//
//Examples (a, b) --> output (explanation)
//(1, 0) --> 1 (1 + 0 = 1)
//        (1, 2) --> 3 (1 + 2 = 3)
//        (0, 1) --> 1 (0 + 1 = 1)
//        (1, 1) --> 1 (1 since both are same)
//        (-1, 0) --> -1 (-1 + 0 = -1)
//        (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
//Your function should only return a number, not the explanation about how you get that number.

public class SumOfTwoInts {

    public static void main(String[] args) {
        System.out.println(sumOfTwo(-1, 10 ));
    }

    public static int sumOfTwo(int a, int b){
        int sum = 0;

        if (a > b){
            for (int i = b; i <= a; i++) {
                sum+=i;
            }
            return sum;
        } else if (a < b){
            for (int i = a; i <= b; i++) {
                sum+=i;
            }
        } else {return a;};
        return sum;
    }

}
