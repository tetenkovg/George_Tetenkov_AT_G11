package homework.day7.tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        String fileName = "figures.txt";

        try  {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            StringBuilder sb = new StringBuilder();
            for (String figure : figures) {
                sb.append(figure).append("-");
            }

            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }

            writer.write(sb.toString());
            writer.close();
            System.out.println("I wrote this in file" + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }


        int count = 0;

        for (String fig : figures){
            if(!fig.contains("и")){
                count++;
            }
        }
        System.out.println("Вот сколько фигур не содержат и: " + count);


        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i));
            System.out.print(" ");
        }

        figures = new ArrayList<>(figures);
        figures.add(2, "Треугольник");

        System.out.println();
        for (String figure : figures) {
            System.out.print(figure + " ");
        }


    }
}
