import java.util.Arrays;

public class ArrayList <T> implements List<T>{ //para poder usar List<T> tuve que cambiar los parametros de algunos metodos a Integer
    private static final int INITIAL_DIM = 5;
    private int dim;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        T[] array = (T[]) new Object[INITIAL_DIM];
        this.dim = 0;
    }

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    @Override
    public void add(T element) {
        if (dim == array.length) {
            resize();
        }
        array[dim++] = element;
    }

    private void resize() {
        array = Arrays.copyOf(array, array.length + INITIAL_DIM);
    }

    @Override
    public int contains(T element) {
        for (int i = 0; i < dim; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index > dim) {
            return false;
        }
        System.arraycopy(array, index + 1, array, index, dim - index - 1);
        dim--;
        return true;
    }
}
