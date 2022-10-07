import java.util.Arrays;

public class ArrayIntegerList implements IntegerList{

    private static final int INITIAL_SIZE = 5;
    private int[] arr;
    private int dim;

    public ArrayIntegerList(){
        arr = new int[INITIAL_SIZE];
        dim = 0;
    }

    @Override
    public void add(int element) {
        if(dim == arr.length){
            resize();
        }
        arr[dim++] = element;
    }

    private void resize(){
        arr = Arrays.copyOf(arr, arr.length + INITIAL_SIZE);
    }

    @Override
    public int indexOf(int element) {
        for(int i = 0; i < dim; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(int index) {
        if(index < 0 || index >= dim){
            return false;
        }
        System.arraycopy(arr, index +1, arr, index, arr.length - index - 1 );
        dim--;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }
}
