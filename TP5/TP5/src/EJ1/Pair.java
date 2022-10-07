package EJ1;

public class Pair<E, T> {

    private E elem1;
    private T elem2;

    public Pair(E elem1, T elem2){
        this.elem1 = elem1;
        this.elem2 = elem2;
    }

    @Override
    public String toString(){
        return String.format("[%s %s]", elem1, elem2);
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Pair<?,?>)){
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        if(!(elem1.equals(pair.elem1))){
            return false;
        }
        return elem2.equals(pair.elem2);
    }

}