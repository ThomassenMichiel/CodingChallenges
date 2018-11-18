package codingbat.warmup1;

import java.util.stream.Stream;

public class StringE {
    public static void main(String[] args) {
        System.out.println(stringE("heele"));
        System.out.println(stringE("heelele"));
        System.out.println(stringE("hello"));
    }

    public static boolean stringE(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if (aChar == 'e') {
                count++;
            }
        }
        return count >= 1 && count <= 3;
    }
}
