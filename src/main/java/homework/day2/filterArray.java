package homework.day2;

import java.util.Collections;
import java.util.ArrayList;

public class filterArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 5;
        int[] filteredArray = filterAndReverse(array, n);
        System.out.print("Filtered and reversed array: ");
        for (int num : filteredArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] filterAndReverse(int[] array, int n) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        ArrayList<Integer> filteredList = new ArrayList<>();
        for (int num : array) {
            if (num > n) {
                filteredList.add(num);
            }
        }

        Collections.reverse(filteredList);

        int[] result = new int[filteredList.size()];
        for (int i = 0; i < filteredList.size(); i++) {
            result[i] = filteredList.get(i);
        }

        return result;
    }

}
