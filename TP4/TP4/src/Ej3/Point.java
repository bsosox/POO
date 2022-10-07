package Ej3;

public class Point{
    protected double x, y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point otherPoint){
        double x2 = (otherPoint.x - x) * (otherPoint.x - x);
        double y2 = (otherPoint.y - y) * (otherPoint.y - y);
        return Math.sqrt(x2 + y2);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
