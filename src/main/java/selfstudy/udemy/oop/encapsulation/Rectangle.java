package selfstudy.udemy.oop.encapsulation;

public class Rectangle {
    private Point leftUpperCorner;
    private Point rightLowerCorner;

    public Rectangle(Point leftUpperCorner, Point rightLowerCorner) {
        this.leftUpperCorner = leftUpperCorner;
        this.rightLowerCorner = rightLowerCorner;
    }

    public double getDiagonal() {
        return leftUpperCorner.distance(rightLowerCorner);

    }

    public int getArea() {
        int width = Math.abs(rightLowerCorner.getX() - leftUpperCorner.getX());
        int height = Math.abs(leftUpperCorner.getY() - rightLowerCorner.getY());
        return width * height;
    }
}
