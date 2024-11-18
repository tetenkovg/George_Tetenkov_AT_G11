package homework.day3.stringstask;

public class FindDuplicates {
    public static void main(String[] args) {
        FindDuplicates finder = new FindDuplicates();
        finder.findDuplicates("hello world hello java java java world");
    }

    void findDuplicates (String text){
        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (words[i] ==  null) {
                continue;
            }

            int count = 1;

            for (int j = i +1; j < words.length; j++) {
                if (words[j] != null && words[i].equals(words[j])) {
                    count++;
                    words[j] = null;
                }
            }

                if (count > 1){
                    System.out.printf("Word '%s' found %d time(s)%n", words[i], count);
                }
            words[i] = null;
        }
    }
}
