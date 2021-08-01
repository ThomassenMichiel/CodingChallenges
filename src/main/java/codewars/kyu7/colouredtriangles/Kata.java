package codewars.kyu7.colouredtriangles;

/**
 * url: https://www.codewars.com/kata/5a25ac6ac5e284cfbe000111/
 */
public class Kata {

    public static char triangle(final String row) {
        String result = row;
        StringBuilder sb = new StringBuilder();
        while (result.length() > 1) {
            for (int i = 0; i < result.toCharArray().length - 1; i++) {
                if (result.charAt(i) == 'B' && result.charAt(i + 1) == 'G' || result.charAt(i + 1) == 'B' && result.charAt(i) == 'G') {
                    sb.append('R');
                } else if (result.charAt(i) == 'R' && result.charAt(i + 1) == 'G' || result.charAt(i + 1) == 'R' && result.charAt(i) == 'G') {
                    sb.append('B');
                } else if (result.charAt(i) == 'B' && result.charAt(i + 1) == 'R' || result.charAt(i + 1) == 'B' && result.charAt(i) == 'R') {
                    sb.append('G');
                } else if (result.charAt(i) == result.charAt(i + 1)) {
                    sb.append(result.charAt(i));
                }
            }
            result = sb.toString();
            sb.setLength(0);
        }
        return result.charAt(0);
    }

}