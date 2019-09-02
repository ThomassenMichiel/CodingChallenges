package codewars.kyu4;

public class JomoPipi {
    public static void main(String[] args) {
        String s = "This is a string exemplification!";
        long before = System.currentTimeMillis();
        System.out.println(stringFunc(s, 7000));
        long after = System.currentTimeMillis();
        System.out.println(after - before);
        
    }
    
    public static String stringFunc(String s, long x) {
        long l = x % 4;
//        long l = x;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverseSB = new StringBuilder();
        for (long i = 0; i < l; i++) {
            for (int j = 0; j < s.length(); j++) {
                reverseSB.setLength(0);
                s = sb.replace(j,s.length(), reverseSB.append(s.substring(j)).reverse().toString()).toString();
            }
            System.out.println(i + "\t" + sb.toString());
        }
        return sb.toString();
    }
}