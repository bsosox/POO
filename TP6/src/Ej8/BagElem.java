package Ej8;

public class BagElem<T> {

    private T elem;

    public BagElem(T elem){
        this.elem = elem;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof BagElem<?>){
            return false;
        }
        BagElem<T> aux = (BagElem<T>) o;
        return elem.equals(aux.elem);
    }


}
