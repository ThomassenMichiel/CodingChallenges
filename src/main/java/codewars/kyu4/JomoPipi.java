package codewars.kyu4;

public class JomoPipi {
    
    public static String stringFunc(String s, long x) {
        System.out.println(s.length() + ":" + x);
        if (x == 0) {
            return s;
        }
        long repetitions = x % s.length();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverseSB = new StringBuilder();
        for (long i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                reverseSB.setLength(0);
                s = sb.replace(j, s.length(), reverseSB.append(s.substring(j)).reverse().toString()).toString();
            }
            System.out.println(s);
        }
        System.out.println(repetitions);
        System.out.println(sb.toString());
        return s;
    }
}
