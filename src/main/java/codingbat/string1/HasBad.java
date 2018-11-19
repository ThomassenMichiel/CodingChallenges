package codingbat.string1;

public class HasBad {
    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }

    public static boolean hasBad(String str) {
        return str.startsWith("bad") || str.startsWith("bad",1);
    }
}
