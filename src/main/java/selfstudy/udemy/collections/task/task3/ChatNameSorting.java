package selfstudy.udemy.collections.task.task3;

import java.util.Comparator;

public class ChatNameSorting implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
    }

}
