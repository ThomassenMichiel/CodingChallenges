package codewars.kyu7;

public class FunReverse {
    public static String funReverse(String s) {
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(0,i) + reverse(s.substring(i));
        }
        return s;
    }
    
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
