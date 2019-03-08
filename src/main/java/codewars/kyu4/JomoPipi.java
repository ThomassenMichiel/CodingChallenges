package codewars.kyu4;

public class JomoPipi {
    public static void main(String[] args) {
    
    }
    public static String stringFunc(String s, long x) {
        StringBuilder sb = new StringBuilder(s);
        String sCopy = s;
        for (long i = 0; i < x; i++) {
            String previous = s;
            for (int j = 0; j < s.length(); j++) {
                String replacement = new StringBuilder(previous.substring(j)).reverse().toString();
                previous = sb.replace(j,sb.length(),replacement).toString();
                
            }
            
            /*if (sCopy.equals(s)) {
                return previous;
            }*/
        }
        return s;
    }
}