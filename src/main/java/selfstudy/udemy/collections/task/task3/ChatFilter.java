package selfstudy.udemy.collections.task.task3;

import java.util.Iterator;
import java.util.List;

public final class ChatFilter {
    public static List<Chat> chatfilter (List<Chat> list) {
        for (Iterator<Chat> iterator = list.iterator();iterator.hasNext();) {
            Chat next = iterator.next();
            if (next.getUsers() < 1000) {
                iterator.remove();
            }

        }
        return list;
    }
}
