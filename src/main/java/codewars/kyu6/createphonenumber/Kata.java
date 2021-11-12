package codewars.kyu6.createphonenumber;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83
 */
public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", Arrays.stream(numbers).boxed().toArray());
    }
}
