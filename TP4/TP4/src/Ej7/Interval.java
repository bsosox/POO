package Ej7;

public class Interval {
    private double start, end, increment;

    public Interval(double start, double end, double increment){
        if (Math.abs(increment) < Double.MIN_VALUE) {
            throw new IllegalArgumentException("Incremento debe ser mayor a 0");
        }
        this.start = start;
        this.end = end;
        this.increment = increment;
        if (size() == 0) {
            throw new IllegalArgumentException("Intervalo vacío.");
        }

    }
    public Interval(double start, double end){
        new Interval(start, end, 1);
    }

    public long size() {
        return Math.max(0, (int) ((end - start) / increment) + 1);
    }


    boolean includes(double valor){

    }

}
