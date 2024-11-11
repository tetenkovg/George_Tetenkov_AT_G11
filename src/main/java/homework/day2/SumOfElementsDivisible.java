package homework.day2;

public class SumOfElementsDivisible {

    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25, 30, 35, 40};
        int result = sumOfElementsDivisibleByFirstDigitOfLength(array);
        System.out.println("Сумма элементов кратных первому элементу " + result);
    }

    public static int sumOfElementsDivisibleByFirstDigitOfLength(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int length = array.length;
        int firstDigit = Integer.parseInt(Integer.toString(length).substring(0, 1));

        int sum = 0;
        for (int num : array) {
            if (num % firstDigit == 0) {
                sum += num;
            }
        }
        return sum;
    }

}
