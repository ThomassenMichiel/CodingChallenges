package codewars.kyu7.regexpbasics.isitahexadecimalnumber;

/**
 * url: https://www.codewars.com/kata/567c9f56d83baeed8300000f/
 */
public class StringUtils {
    
    public static boolean isHexNumber(String s) {
        return s.matches("(?i)(0x)?[0-9a-f]+");
    }
}
