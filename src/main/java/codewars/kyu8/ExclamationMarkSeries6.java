package codewars.kyu8;

public class ExclamationMarkSeries6 {
    public static String remove(String s, int n) {
        for (int i = 0, count = 0; i < s.length() && count < n; i++) {
            if (s.charAt(i) == '!') {
                s = s.substring(0,i) + s.substring(i+1);
                i--;
                count++;
            }
        }
        return s;
    }
}