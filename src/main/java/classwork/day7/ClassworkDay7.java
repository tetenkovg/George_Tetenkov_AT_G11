package classwork.day7;

import java.util.*;

public class ClassworkDay7 {
    public static void main(String[] args) {
        String text = "Мама мыла раму мыла";

        String[] words = text.split(" ");

        Map<Integer, String> hashMap  = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            hashMap.put(i, words[i]);
        }


        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(hashMap.get(i));

        }

        for (int key : hashMap.keySet()){
            System.out.println(key);
        }

        for (String key : hashMap.values()){
            System.out.println(key);
        }


        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }





//        List<String> arrayList = new ArrayList<>();
//        List<String> linkedList = new LinkedList<>();
//
//
//        for (int i = 0; i < 10000; i++) {
//            arrayList.add("Array List string " + i);
//            linkedList.add("Linked List string " + i);
//        }
//
//
//        long to = System.currentTimeMillis();
//
//        for (int i = 0; i < arrayList.size(); i++) {
//           arrayList.get(i);
//        }
//
//        System.out.println(System.currentTimeMillis() - to);
//
//        to = System.currentTimeMillis();
//
//        for (int i = 0; i < linkedList.size(); i++) {
//            linkedList.get(i);
//        }
//
//        System.out.println(System.currentTimeMillis() - to);


//        System.out.println("Начинаю крутить лист:");
//
//        for (String word : words){
//            arrayList.add(word);
//        }
//
//        for (String word : arrayList){
//            System.out.println(word);
//        }
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//
//        }




    }




}
