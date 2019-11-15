package codewars.kyu8;

import java.util.Collections;

public class RepeatIt {
    public static String repeatString(final Object toRepeat, final int n) {
        if (toRepeat instanceof String) {
            return String.join("", Collections.nCopies(n, (String) toRepeat));
        } else {
            return "Not a string";
        }
    }
}
