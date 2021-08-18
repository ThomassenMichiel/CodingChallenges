package codewars.kyu7.reversewords;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * url: https://www.codewars.com/kata/5259b20d6021e9e14c0010d4
 */
public class Kata {
    public static String reverseWords(final String original) {
        return Arrays.stream(original.split("((?<= )|(?= ))"))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining());
    }
}
