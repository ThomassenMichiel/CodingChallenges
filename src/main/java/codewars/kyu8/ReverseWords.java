package codewars.kyu8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {
    
    public static void main(String[] args) {
        System.out.println(reverseWords("i like to eat"));
    }
    
    public static String reverseWords(String str) {
        /*return Stream.of(str)
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(" "));*/
                
        List<String> collect = Arrays.stream(str.split(" ")).collect(Collectors.toList());
        Collections.reverse(collect);
        return String.join(" ",collect);
    }
}