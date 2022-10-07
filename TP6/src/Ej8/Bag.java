package Ej8;

import java.util.List;

public interface Bag<T>{

    public void add(T elem);
    public int sizeDistinct();
    public int count(T elem);
    public int size();
    public boolean contains(T elem);
    public void remove(T elem);
}

