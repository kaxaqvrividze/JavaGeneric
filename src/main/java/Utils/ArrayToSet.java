package Utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayToSet {
    public static <E> Set<E> toSet(List<E> l){
        return new HashSet<E>(l);
    }
}
