package codingbat.warmup2;

import java.util.Random;

public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringPlosion("Code"));
        System.out.println(stringPlosion("abc"));
        System.out.println(stringPlosion("ab"));
    }

    public static String stringPlosion(String str) {
        String holder = "";
        for (int i = 0; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                holder += str.charAt(j);
            }
        }
        return holder;
    }
}
