package codewars.kyu5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JomoPipi {
    
    public static void main(String[] args) {
    }
    
    public static String jumbledString(String s, long n) {
        List<String> stringSet = new ArrayList<>();
        String previousValue = s;
    
        int timesToGo = s.length() % 4;
        if (timesToGo > n) {
            timesToGo = (int) n;
        }
        for (long i = 0; i < n; i++) {
            String tempHolder = jumbleStuff(previousValue);
    
            System.out.println(tempHolder);
            
            if (stringSet.contains(tempHolder)) {
                break;
            }
            
            stringSet.add(tempHolder);
            previousValue = tempHolder;
        }
        
        return previousValue;
    }
    
    public static String jumbleStuff(String previousValue) {
        Stream<String> evenStream = IntStream.range(0, previousValue.length())
                .filter(j -> j % 2 == 0)
                .mapToObj(previousValue::charAt)
                .map(String::valueOf);
        
        Stream<String> oddStream = IntStream.range(0, previousValue.length())
                .filter(j -> j % 2 == 1)
                .mapToObj(previousValue::charAt)
                .map(String::valueOf);
        
        return Stream.concat(evenStream, oddStream).collect(Collectors.joining());
    }
    
}