package selfstudy.udemy.collections.task.task3;

import java.util.Comparator;

public class AmountOfUsersChatNameComparator implements Comparator<Chat> {


    @Override
    public int compare (Chat o1, Chat o2){
         if (Integer.compare(o2.getUsers(), o1.getUsers()) == 0){
             return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
         } else return Integer.compare(o2.getUsers(), o1.getUsers());
    }

}
