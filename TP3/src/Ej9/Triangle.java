package Ej9;

public class Triangle extends Figure{
    private Point firstPoint, secondPoint, thirdPoint;

    public Triangle(Point topPoint, Point baseLeft, Point baseRight){
        this.firstPoint = topPoint;
        this.secondPoint = baseLeft;
        this.thirdPoint = baseRight;
    }

    private double firstSide() {
        return firstPoint.distanceTo(secondPoint);
    }

    private double secondSide() {
        return secondPoint.distanceTo(thirdPoint);
    }

    private double thirdSide() {
        return thirdPoint.distanceTo(firstPoint);
    }

    @Override
    public double area(){
        double semiPerimeter = perimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstSide()) * (semiPerimeter - secondSide())
                * (semiPerimeter - thirdSide()));
    }

    @Override
    public double perimeter(){
        return firstSide() + secondSide() + thirdSide();
    }

    @Override
    public String toString(){
        return String.format("Triángulo [ %s, %s, %s ]", firstPoint, secondPoint, thirdPoint);
    }
}
