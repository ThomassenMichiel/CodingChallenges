package codewars.kyu7.spacify;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * url: https://www.codewars.com/kata/57f8ee485cae443c4d000127/
 */
public class Spacify {
    public static String spacify(String str){
        return Arrays.stream(str.split("")).collect(Collectors.joining(" "));
    }
}
