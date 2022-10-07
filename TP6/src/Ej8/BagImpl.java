package Ej8;

import java.util.ArrayList;
import java.util.List;

public class BagImpl<T> implements Bag<T>{

    private List<BagElem<T>> lista = new ArrayList<BagElem<T>>();
    private int size = 0, sizeDistinct = 0;

    public BagImpl(){}


    @Override
    public void add(T elem) {
       if(!(contains(elem))){
           lista.add(elem);
       }
    }

    @Override
    public int sizeDistinct() {
        return sizeDistinct;
    }

    @Override
    public int count(T elem) {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T elem) {

    }

    @Override
    public void remove(T elem) {

    }
}
