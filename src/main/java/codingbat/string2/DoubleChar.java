package codingbat.string2;

import java.util.stream.Collectors;

public class DoubleChar {
    public static String doubleChar(String str) {
        return str.chars()
                .mapToObj(value -> "" + (char) value + (char) value)
                .collect(Collectors.joining());
    }
}
