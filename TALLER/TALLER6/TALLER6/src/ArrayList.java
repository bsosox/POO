import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements List<T>{

    private T[] elements;
    private static final int INITIAL_DIM = 5;
    private int dim;
    private Comparator<T> comparator;

    @SuppressWarnings("unchecked")
    public ArrayList(Comparator<T> comparator) {

        elements = (T[]) new Object[INITIAL_DIM];
        this.comparator = comparator;
    }

    @Override
    public int contains(T element) {
        for (int i = 0; i < dim; i++) {
            if(elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(T element) {
        if(dim == elements.length) {
            resize();
        }
        elements[dim++] = element;
    }
    
    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length + INITIAL_DIM);
    }

    @Override
    public boolean remove(int index) {
        if(index < 0 || index >= dim) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(elements, index + 1, elements, index, dim - 1 - index);
        dim--;
        return true;
    }

    @Override
    public Iterator<T> iterator() {

        T[] aux = Arrays.copyOf(elements,dim); //como quiero mantener el original
        Arrays.sort(aux, comparator);
        return new ArrayListIterator(aux);
    }


    private class ArrayListIterator implements Iterator<T>{

        private T[] auxElements;
        public ArrayListIterator(T[] aux){
            this.auxElements = aux;
        }
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < auxElements.length;
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return elements[index++];
        }
    }



}
