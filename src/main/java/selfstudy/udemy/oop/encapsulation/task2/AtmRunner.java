package selfstudy.udemy.oop.encapsulation.task2;

public class AtmRunner {
    public static void main(String[] args) {
        Atm atm = new Atm(2, 1, 1);

        atm.withdrawCash(180);

        String text = "hello";
        String text2 = "hello";

        text.endsWith(text2);

        System.out.println(rps("rock", "paper"));


    }

    public static String rps (String p1, String p2){
        if (p1.equals("scissors") && p2.equals("paper") || p1.equals("paper") && p2.equals("rock") || p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        } else if (p1.equals("paper") && p2.equals("scissors") || p1.equals("rock") && p2.equals("paper") || p1.equals("scissors") && p2.equals("rock")) {
            return "Player 2 won!";
        } else return "Draw!";
    }
}

