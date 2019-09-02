package codewars.kyu8;

import java.util.stream.Stream;

public class Nessie {
    public static boolean isLockNessMonster(String s){
        return Stream.of("tree fiddy", "3.50", "three fifty")
                .map(String::toLowerCase)
                .anyMatch(s::contains);
    }
}