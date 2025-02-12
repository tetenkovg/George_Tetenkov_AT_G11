package selfstudy.udemy.oop.incapsulation;

public class Runner {
    public static void main(String[] args) {

        Point pointOne = new Point(2, 4);
        Point pointTwo = new Point(4, 25);


        Rectangle rectagle = new Rectangle(pointOne, pointTwo);

        System.out.println(pointOne.distance(pointTwo));
        System.out.println(pointTwo.distance(pointOne));

        System.out.println(rectagle.getArea());
        System.out.println(rectagle.getDiagonal());

    }
}
