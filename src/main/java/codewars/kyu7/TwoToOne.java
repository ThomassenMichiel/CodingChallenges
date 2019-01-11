package codewars.kyu7;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(longest("appel", "peer"));
    }
    
    public static String longest (String s1, String s2) {
        return s1.concat(s2)
                .chars()
                .distinct()
                .mapToObj(value -> (char) value)
                .map(String::valueOf)
                .sorted()
                .collect(Collectors.joining());
    }
}