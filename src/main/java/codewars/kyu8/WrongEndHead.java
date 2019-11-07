package codewars.kyu8;

import org.apache.commons.lang3.ArrayUtils;

public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        ArrayUtils.reverse(arr);
        return arr;
    }
}
