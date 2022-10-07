package Ej6;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double a, double b) {
       setReal(a);
       setImaginary(b);
    }
    public ComplexNumber(Number a){
        this(a.doubleValue(), 0);
    }


    public void setReal(double a) {
        this.real = a;
    }
    public void setImaginary(double b){
        this.imaginary = b;
    }

    public double getReal(ComplexNumber z){
        return z.real;
    }
    public double getImaginary(ComplexNumber z){
        return z.imaginary;
    }

    public ComplexNumber plus(ComplexNumber z){
        return new ComplexNumber(this.real + z.real, this.imaginary + z.imaginary);
    }
    public ComplexNumber addition(Number c){
        return plus(new ComplexNumber(c));
    }

    @Override
    public String toString(){
        return String.format("%.2f %c %.2f", real, imaginary > 0 ? '+':'-', Math.abs(imaginary));
    }
}
