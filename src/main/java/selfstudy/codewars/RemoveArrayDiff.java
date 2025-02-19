package selfstudy.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveArrayDiff {


    public static void main(String[] args) {

        int[] arrayA = new int[]{1, 2, 2};
        int[] arrayB = new int[]{1};

       int[] arrayC = arrayDiff(arrayA, arrayB);

        for (int i = 0; i < arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }

    }

//    public static int[] arrayDiff(int[] a, int[] b) {
//        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
//        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
//        listA.removeAll(listB);
//        return listA.stream().mapToInt(e -> e).toArray();
//    }

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> listA = Arrays.stream(a)
                .boxed()
                .toList();

        List<Integer> listB = Arrays.stream(b)
                .boxed()
                .toList();

        List<Integer> listC = new ArrayList<>();

        for (int i = 0; i < listA.size(); i++) {
            if (!listB.contains(listA.get(i))) {
                listC.add(listA.get(i));
            }
        }

        for (int i = 0; i < listB.size(); i++) {
            if (!listA.contains(listB.get(i))) {
                listC.add(listB.get(i));
            }
        }

        int[] array = new int[listC.size()];

        for (int i = 0; i < listC.size(); i++) {
            array[i] = listC.get(i);
        }

        return array;
    }
}
