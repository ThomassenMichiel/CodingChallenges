package codewars.kyu7.regexpbasics.parsingprices;

/**
 * url: https://www.codewars.com/kata/56833b76371e86f8b6000015
 */
public class CentParser {
    public static Integer toCents(String price) {
        if (price.matches("^\\$\\d+\\.\\d{2}$")) {
            return Integer.parseInt(price.replaceAll("[$.]", ""));
        }
        return null;
    }
}
