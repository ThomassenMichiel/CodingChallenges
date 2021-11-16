package codewars.kyu7.regexvalidatepincode;

import java.util.regex.Pattern;

/**
 * url: https://www.codewars.com/kata/55f8a9c06c018a0d6e000132
 */
public class Solution {
    public static boolean validatePin(String pin) {
        Pattern pinPattern = Pattern.compile("\\d{4}|\\d{6}");
        return pinPattern.matcher(pin).matches();
    }
}
