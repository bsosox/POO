package Ej1;

public abstract interface Criteria<T> {
    boolean satisfies(T obj);
}
