package homework.day7.tasks;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    /*
    Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
Проитерировать список по индексу и отпечатать слова в консоль через пробел
Заменить 3-й элемент списка на Синица
Проитерировать список через for-each и отпечатать слова в консоль через пробел*/

    public static void main(String[] args){
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");



        for(String bird : birds){
            System.out.println("--" + bird + "--");
        }

        String vowels = "аеёиоуыэюя";
        int count = 0;
        for (String bird : birds){
            int vowelCount = 0;
            for(char c : bird.toLowerCase().toCharArray()){
                if (vowels.indexOf(c) != -1){
                    vowelCount++;
                }
            }
            if(vowelCount >= 1){
                count++;
            }
        }

        System.out.println(count);

    }
}
