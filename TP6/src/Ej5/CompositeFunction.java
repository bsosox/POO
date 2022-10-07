package Ej5;

import java.util.ArrayList;


public class CompositeFunction implements Function {

    private ArrayList<Function> lista = new ArrayList<>();

    public CompositeFunction() {
    }

    public void addFunction(Function f){
        lista.add(f);
    }

    @Override
    public double evaluate(double x) {
        if(lista.isEmpty()){
            throw new IllegalStateException();
        }
        double ev = x;

        for(Function f : lista){
            ev = f.evaluate(ev);
        }

        return ev;
    }

}
