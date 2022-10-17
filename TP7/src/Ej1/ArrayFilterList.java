package Ej1;

import java.util.ArrayList;

public class ArrayFilterList<E> extends ArrayList<E> implements FilterList<E>{
    public FilterList<E> filter(Criteria<E> criteria) {
        FilterList<E> result = new ArrayFilterList<>();
        for(E elem : this) {
            if (criteria.satisfies(elem)) {
                result.add(elem);
            }
        }
        return result;
    }
}
