package selfstudy.udemy.collections.task.task3;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        List<Chat> chatList = new ArrayList<>();
        chatList.add(new Chat("aQA Leads", 999));
        chatList.add(new Chat("bQA Perf", 1000));
        chatList.add(new Chat("zQA Manual", 1000));
        chatList.add(new Chat("yQA Auto", 1001));


        chatList.sort(new AmountOfUsersChatNameComparator());
        System.out.println(chatList);

        chatList.sort(new ChatNameSorting());
        System.out.println(chatList);


        System.out.println(ChatFilter.chatfilter(ChatFilter.chatfilter(chatList)));


    }
}
