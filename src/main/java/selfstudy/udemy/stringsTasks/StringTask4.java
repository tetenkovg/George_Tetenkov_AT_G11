package selfstudy.udemy.stringsTasks;

public class StringTask4 {

    public static void main(String[] args) {
        String text = "!..dsadadd,adada sd a>.d asd ada .ad as.d! .d a1>>...!";

        System.out.println(counter(text));


    }

    public static int counter(String text) {
      String result = text.replace(".", "")
              .replace(",", "")
              .replace("!", "");

      return text.length() - result.length();
    }
}
