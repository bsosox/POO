package Ej9;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double distanceTo(Point3D otherPoint){
        double x2 = (otherPoint.x - x) * (otherPoint.x - x);
        double y2 = (otherPoint.y - y) * (otherPoint.y - y);
        double z2 = (otherPoint.z - z) * (otherPoint.z - z);
        return Math.sqrt(x2 + y2 + z2);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
