package homework.day7.tasks;

import homework.day7.utils.Water;

import java.util.Arrays;
import java.util.List;

public class Task13 {
//    13.
//    Создать список воды (класса Water) water из 3 объектов воды с цветом (Прозрачная, Прозрачная, Мутная) и запахом (Нет, Нет, Аммиачный) соответственно, через (Arrays.asList())
//    Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки

    public static void main(String[] args) {
        List<Water> waters = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"));


        for (Water water : waters){
            System.out.println(water.getColor() + " - " + water.getSmell());
        }
    }


}
