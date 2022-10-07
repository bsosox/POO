package Ej3;

import Ej3.Figure;
import Ej3.Point;

public class Rectangle extends Figure {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getBase(){
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }
    public double getHeight(){
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    @Override
    public double area(){
        return getBase() * getHeight();
    }

    @Override
    public double perimeter() {
        return (getBase() + getHeight()) * 2;
    }

    @Override
    public String toString() {
        return String.format("Rectángulo [ %s , %s ]", topLeft, bottomRight);
    }
}
