package homework.day7.tasks;

import homework.day7.utils.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task19 {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();

        library.add(new Book("Война и мир", "Толстой"));
        library.add(new Book("Преступление и наказание", "Достоевский"));
        library.add(new Book("Мастер и Маргарита", "Булгаков"));

        for (Book book : library) {
            System.out.print(book.getName() + " ");
        }
        System.out.println();

        Map<String, String> bookMap = new HashMap<>();

        for (Book book : library) {
            bookMap.put(book.getName(), book.getAutor());
        }

        System.out.println();
        for (String key : bookMap.keySet()) {
            System.out.println(key);
        }

        System.out.println();
        for (String value : bookMap.values()) {
            System.out.println(value);
        }

        System.out.println();
        for (Map.Entry<String, String> entry : bookMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}
