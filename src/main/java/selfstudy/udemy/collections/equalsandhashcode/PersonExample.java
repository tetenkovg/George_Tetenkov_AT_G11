package selfstudy.udemy.collections.equalsandhashcode;

public class PersonExample {

    public static void main(String[] args) {
       PersonUdemy ivan =  new PersonUdemy(1, "Ivan", "Ivanov");
       PersonUdemy petr =  new PersonUdemy(1, "Ivan", "Ivanov");


        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());

        System.out.println(ivan.equals(petr));
    }
}
