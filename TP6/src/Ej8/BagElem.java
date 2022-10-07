package Ej8;

public class BagElem<T> {

    private T elem;
    private int amount = 0;

    public BagElem(T elem){
        this.elem = elem;
    }

    public int getAmount(){
        return amount;
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
