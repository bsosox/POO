package Ej8;

import java.util.*;

public class BagImpl<T> implements Bag<T>{

    private Map<T, Integer> mapa = new HashMap<>();
    private int sizeDistinct = 0;

    public BagImpl(){}


    @Override
    public void add(T elem) {
        if(!(mapa.containsKey(elem))){
            mapa.put(elem, 1);
        } else {
            mapa.put(elem, mapa.get(elem) + 1);
        }
    }

    @Override
    public int sizeDistinct() {
        return mapa.size();
    }

    @Override
    public int count(T elem) {
        return mapa.getOrDefault(elem, 0);
    }

    @Override
    public int size() {
        int total = 0;
        for(int i : mapa.values()){
            total += i;
        }
        return total;
    }

    public boolean contains(T elem) {
        return mapa.containsKey(elem);
    }

    @Override
    public void remove(T elem) {
        if(contains(elem)) {
            throw new NoSuchElementException();
        }
        int prevAmount = count(elem);
        if(prevAmount == 1){
            mapa.remove(elem);
        } else if (prevAmount > 1){
                int newAmount = mapa.get(elem) - 1;
                mapa.put(elem, newAmount);
        }

    }
}
