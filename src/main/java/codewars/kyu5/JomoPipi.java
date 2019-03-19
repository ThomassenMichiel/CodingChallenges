package codewars.kyu5;

import java.util.*;
import java.util.stream.Collectors;

public class JomoPipi {
    public static void main(String[] args) {
        String s = "this_test_will_hurt_you";
        while (s.length() < 1_000_000) {
            System.out.println(s.length());
            s += s;
        }
        System.out.println("done");
        System.out.println("==========================");
        jumbledString(s, 12345678987654321L);
    }
    
    public static String jumbledString(String s, long n) {
        List<String> stringSet = new ArrayList<>();
        String previousValue = s;
        for (long i = 0; i < n; i++) {
            String tempHolder = jumbleStuff(previousValue);
            System.out.println(tempHolder);
            if (stringSet.contains(tempHolder)) {
                break;
            }
            
            stringSet.add(tempHolder);
            previousValue = tempHolder;
        }
        
        if (n <= stringSet.size()) {
            previousValue = stringSet.get(stringSet.size()-1);
        } else {
            long timesLeftToDo =  n % stringSet.size();
            previousValue = stringSet.get((int) timesLeftToDo-1);
        }
        
        return previousValue;
    }
    
    public static String jumbleStuff(String s) {
        LinkedList<Character> strings = new LinkedList<>();
    
        int even = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                strings.add(even++,s.charAt(i));
            } else {
                strings.add(s.charAt(i));
            }
            System.out.println(strings);
        }
        
        return strings.stream().map(String::valueOf).collect(Collectors.joining());
    }
    
}