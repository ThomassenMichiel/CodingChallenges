package codewars.kyu5;

public class JomoPipi {

    public static String jumbledString(String s, long n) {
        String original = s;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            s = jumble(s);
            if (s.equals(original)) {
                count = i;
                break;
            }
        }
        n %= count;
        if (n == 0) {
            return s;
        }

        for (long i = 0; i < n; i++) {
            original = jumble(original);
        }
        return original;
    }

    public static String jumble(String s) {
        char[] chars = s.toCharArray();
        char[] result = new char[s.length()];
        for (int j = 0, k = 0, l = (s.length()+1) / 2; j < chars.length; j++) {
            if (j % 2 == 0) {
                result[k++] = chars[j];
            } else {
                result[l++] = chars[j];
            }
        }
        return String.valueOf(result);
    }
}
