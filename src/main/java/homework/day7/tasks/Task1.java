package homework.day7.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");


        for (String butterfly : butterflies){
            System.out.println("\"" + butterfly + "\"");
        }

        int count = 0;
        for (String bf : butterflies){
            if (bf.toLowerCase().contains("o")){
                count++;
            }
        }
        System.out.println("Вот сколько бабочек содержат букву о: " + count);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i));
            System.out.print(" ");
        }

        for (String bf : butterflies){
            System.out.println(bf);
        }
    }


}
