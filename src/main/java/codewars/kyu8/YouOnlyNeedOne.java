package codewars.kyu8;

import java.util.Arrays;

public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}
