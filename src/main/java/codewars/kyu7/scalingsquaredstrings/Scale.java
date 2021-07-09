package codewars.kyu7.scalingsquaredstrings;

/**
 * url: https://www.codewars.com/kata/56ed20a2c4e5d69155000301
 */
public class Scale {
    public static String scale(String strng, int k, int v) {
        if (strng.isEmpty()) {
            return strng;
        }
        String[] split = strng.split("\n");
        String[] result = new String[v * split.length];
        for (int i = 0, resultPos = 0; i < split.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < split[i].length(); j++) {
                sb.append(String.valueOf(split[i].charAt(j)).repeat(k));
            }
            for (int l = 0; l < v; l++) {
                result[resultPos++] = sb.toString();
            }
        }
        return String.join("\n", result);
    }
}
