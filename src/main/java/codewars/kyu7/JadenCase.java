package codewars.kyu7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JadenCase {
    public static void main(String[] args) {
        System.out.println(toJadenCase("har har har"));
    }

    public static String toJadenCase(String phrase) {
        return Stream.of(phrase.split(" "))
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ")
                .collect(Collectors.joining())
                .trim();
    }

}