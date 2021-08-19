package codewars.kyu7.splitinparts;

/**
 * url: https://www.codewars.com/kata/5650ab06d11d675371000003
 */
public class InParts {
    public static String splitInParts(String s, int partLength) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % partLength == 0) {
                result.append(" ");
            }
            result.append(s.charAt(i));
        }
        return result.toString().stripLeading();
    }
}
