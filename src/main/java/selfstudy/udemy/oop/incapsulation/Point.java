package selfstudy.udemy.oop.incapsulation;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point) {
        double xPow = Math.pow(x - point.x, 2.0);
        double yPow = Math.pow(y - point.y, 2.0);
        return Math.sqrt(xPow + yPow);
    }
}
