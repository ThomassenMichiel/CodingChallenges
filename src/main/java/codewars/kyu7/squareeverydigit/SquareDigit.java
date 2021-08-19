package codewars.kyu7.squareeverydigit;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * url: https://www.codewars.com/kata/546e2562b03326a88e000020
 */
public class SquareDigit {
    
    public int squareDigits(int n) {
        return Integer.parseInt(Arrays.stream(String.valueOf(n)
                .split(""))
                .map(Integer::valueOf)
                .map(integer -> Math.pow(integer, 2))
                .map(obj -> String.valueOf(obj.intValue()))
                .collect(Collectors.joining()));
    }
    
}
