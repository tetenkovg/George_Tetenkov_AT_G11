package homework.day2;

public class ArraySum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 3;
        int result = sumOfEveryNthElement(array, n);
        System.out.println("Sum of every " + n + "-th element: " + result);
    }

    public static int sumOfEveryNthElement(int[] array, int n) {
        if (array == null || array.length == 0 || n <= 0) {
            System.out.println("Invalid input: check that the array is not empty and n is greater than 0.");
            return 0;
        }

        int sum = 0;
        for (int i = n - 1; i < array.length; i += n) {
            sum += array[i];
        }

        return sum;
    }


}

