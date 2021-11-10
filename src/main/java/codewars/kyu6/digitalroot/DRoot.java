package codewars.kyu6.digitalroot;

import java.util.Arrays;

/**
 * url: https://www.codewars.com/kata/541c8630095125aba6000c00
 */
public class DRoot {
    public static int digital_root(int n) {
        while (n >= 10) {
            n = Arrays.stream(String.valueOf(n).split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
        return n;
    }
}
