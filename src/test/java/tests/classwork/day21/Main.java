package tests.classwork.day21;

import org.openqa.selenium.InvalidArgumentException;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.MIN_VALUE;


//Задача 1: FizzBuzz
//Условие: Вывести числа от 1 до n. При этом:
//Если число делится на 3, выводим Fizz;
//Если число делится на 5, выводим Buzz;
//Если число делится на 3 и 5 одновременно, выводим FizzBuzz;
//Иначе выводим само число.
//Цель: Проверка базовых навыков написания циклов, условий, а также понимания кратности/остатка от деления.

public class Main {

    public static void main(String[] args) {
        String text = "Hello how are you herMorzoviiiiiii";
        int[] arrayOfInts = {10, 9};


        List<String> list = Arrays.asList("Hi", "Hi", "helloe", "hello", "Hell1", "Hell1");


        System.out.println(uniqueCharsStorer(text).size());
        System.out.println(reverser(text));
        System.out.println(polindromesFinder(arrayOfInts));

        fizBuzz(arrayOfInts);

        System.out.println();
        System.out.println(stringWithMaxLengt(text));
        System.out.println(stringWithMaxLength(text));
        System.out.println(removeDoublicatesFromTheList(list).toString());


        try {
            System.out.println(findSencMaxElement(arrayOfInts));
        } catch (InvalidArgumentException e){
            System.out.println("Error: " + e.getMessage());
        };

    }

    public static String reverser(String text) {
        StringBuilder string = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            string.append(text.charAt(i));
        }

        return string.toString();
    }

    public static Set<Character> uniqueCharsStorer(String text) {
        Set<Character> s = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            s.add(text.toCharArray()[i]);
        }
        return s;
    }

    public static List<String> polindromesFinder(int[] arrayOfInts) {
        List<String> palindromes = new ArrayList<>();

        for (int a : arrayOfInts) {
            String element = String.valueOf(a);
            StringBuilder reversedElement = new StringBuilder(element).reverse();

            if (element.equals(reversedElement.toString())) {
                palindromes.add(element);

            }
        }
        return palindromes;
    }

    public static List<String> polindromeStream(int[] arrayOfInts) {

        if (arrayOfInts.length == 0) {
            System.out.println("Array is empty");

        }
        return Arrays.stream(arrayOfInts)
                .mapToObj(x -> String.valueOf(x))
                .filter(x -> x.equals(new StringBuilder(x).reverse().toString()))
                .collect(Collectors.toList());
    }

    public static void fizBuzz(int[] arraOfInts) {
        if (arraOfInts.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        for (int x : arraOfInts) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (x % 3 == 0) {
                System.out.print("Fizz ");
            } else if (x % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.println("Neither Fizz Nor Buzz");
            }
        }
    }

    static String stringWithMaxLengt(String text) {
        if (text.length() == 0 || text.isEmpty()) {
            return "Text is Empty";

        }
        String[] stringsList;
        stringsList = text.split(" ");

        int max = 0;
        int indexOfMaxString = 0;
        for (int i = 0; i < stringsList.length; i++) {
            if (max < stringsList[i].length()) {
                max = stringsList[i].length();
                indexOfMaxString = i;
            }
        }
        return stringsList[indexOfMaxString];
    }

    static String stringWithMaxLength(String text) {
        if (text.length() == 0 || text.isEmpty()) {
            return "Text is Empty";

        }
        return Arrays.stream(text.split(" "))
                .max((a, b) -> Integer.compare(a.length(), b.length()))
                .orElse("No Words Found");

    }


//    Задача 7: Удаление дубликатов в списке
//    Условие: Дан список (ArrayList) из целых чисел. Удалить дубликаты, сохранив порядок.
//    Цель: Проверка знаний о List, Set и умении комбинировать их для фильтрации.

    static List<String> removeDoublicatesFromTheList(List<String> list) {
        return list.stream().distinct().toList();
    }


    //    Задача 8: Поиск второго по величине элемента в массиве
//    Условие: Найти второй (или k-й) по величине элемент массива.
//    Пример: [2, 8, 1, 10, 10, 7] – второй по величине = 8 (если считать, что 10 – первый).
//    Цель: Работа с массивами, алгоритмическое мышление: как найти k-й максимум или минимум без полной сортировки, либо используя сортировку.
    static int findSencMaxElement(int[] arrayOfInts) {
        if (arrayOfInts.length <= 1) {
            System.out.println("lenght is lower than 2");
            throw new InvalidArgumentException("invalid array");
        }


        int max = MIN_VALUE;
        int secondAfterMax = MIN_VALUE;

        for (int a : arrayOfInts) {
            if (max < a) {
                secondAfterMax = max;
                max = a;
            } else if (a > secondAfterMax && a < max) secondAfterMax = a;
        }

        if (secondAfterMax == MIN_VALUE) {
            {
                throw new InvalidArgumentException("Second After Max was not found as all values in array equal each other");

            }
        }
        return secondAfterMax;
    }
}
