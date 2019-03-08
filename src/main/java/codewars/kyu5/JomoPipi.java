package codewars.kyu5;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JomoPipi {
    public static void main(String[] args) {
        System.out.println(jumbledString("Greetings",8));
    }
    
    public static String jumbledString(String s, long n) {
        Set<String> stringSet = new HashSet<>();
        String previousValue = s;
        
        for (long i = 0; i < n; i++) {
            Stream<String> evenStream = IntStream.range(0, s.length())
                    .filter(j -> j % 2 == 0)
                    .mapToObj(s::charAt)
                    .map(String::valueOf);
    
            Stream<String> oddStream = IntStream.range(0, s.length())
                    .filter(j -> j % 2 == 1)
                    .mapToObj(s::charAt)
                    .map(String::valueOf);
            
            s = Stream.concat(evenStream,oddStream).collect(Collectors.joining());
    
//            if (stringSet.contains(s)) {
//                break;
//            }
            stringSet.add(s);
            previousValue = s;
            System.out.println(i);
            System.out.println(s);
        }
    
        System.out.println(stringSet.size());
        return previousValue;
    }
    
}