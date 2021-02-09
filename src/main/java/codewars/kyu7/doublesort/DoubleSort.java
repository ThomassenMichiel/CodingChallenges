package codewars.kyu7.doublesort;

import java.util.Arrays;

public class DoubleSort {
    public static Object[] dbSort(Object[] a){
        return Arrays.stream(a)
                .sorted((o, t1) -> {
                    if (o instanceof Integer && t1 instanceof Integer) {
                        return ((Integer) o).compareTo((Integer) t1);
                    } else if (o instanceof String && t1 instanceof String) {
                        return ((String) o).compareTo((String) t1);
                    } else if (o instanceof String && t1 instanceof Integer) {
                        return 1;
                    } else if (o instanceof Integer && t1 instanceof String) {
                        return -1;
                    }
                    return 0;
                })
                .toArray(Object[]::new);
    }
}
