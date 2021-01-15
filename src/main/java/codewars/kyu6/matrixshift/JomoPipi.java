package codewars.kyu6.matrixshift;

public class JomoPipi {
    public static char[][] shift(char[][] m, int n) {
        StringBuilder sb = new StringBuilder();
        for (char[] chars : m) {
            sb.append(chars);
        }
        String s = sb.substring(sb.length() - n % sb.length()) + sb.substring(0, sb.length() - n % sb.length());
        char[][] chars = new char[m.length][m[0].length];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                chars[i][j] = s.charAt(i * m[0].length + j);
            }
        }
        return chars;
    }
}
