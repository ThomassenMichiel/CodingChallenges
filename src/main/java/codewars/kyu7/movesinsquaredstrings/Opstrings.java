package codewars.kyu7.movesinsquaredstrings;

import java.util.Arrays;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * url: https://www.codewars.com/kata/56dbe0e313c2f63be4000b25/
 */
class Opstrings {
    
    public static String vertMirror(String strng) {
        return Arrays.stream(strng.split("\n")).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining("\n"));
    }
    
    public static String horMirror(String strng) {
        String[] splitString = strng.split("\n");
        StringBuilder sb = new StringBuilder();
        for (int i = splitString.length - 1; i >= 0; i--) {
            sb.append(splitString[i]).append("\n");
        }
        return sb.toString().trim();
    }
    
    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply(s);
    }
}
