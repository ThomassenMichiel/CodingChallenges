package codingbat.warmup2;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }

    public static String stringBits(String str) {
        String holder = "";
        for (int i = 0; i < str.length(); i += 2) {
            holder += str.charAt(i);
        }
        return holder;
    }
}
