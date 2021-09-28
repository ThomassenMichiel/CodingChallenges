package codewars.kyu7.thereisnoe;

import java.util.Locale;

/**
 * https://www.codewars.com/kata/594b8e182fa0a0d7fc000875/
 */
public class WithoutLetterE {
    public static String findE(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return str;
        }
        str = str.toLowerCase();
        if (!str.contains("e")) {
            return "There is no \"e\".";
        }
        return String.valueOf( str.replaceAll("[^e]", "").length());
    }
}
