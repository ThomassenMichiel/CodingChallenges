package codewars.kyu6;

import java.util.stream.Stream;

public class HighestScoringWord {
    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));
        System.out.println(high("what time are we climbing up to the volcano"));
        System.out.println(high("take me to semynak"));
    }
    
    public static String high(String s) {
        return Stream.of(s)
                .flatMap(word -> Stream.of(word.split(" ")))
                .max(HighestScoringWord::compareByWords)
                .get();
    }

    private static int compareByWords(String o1, String o2) {
        if (o1.chars().sum() == o2.chars().sum()) {
            return 0;
        }

        if (o1.chars().map(i -> i - 96).sum() < o2.chars().map(i -> i - 96).sum()) {
            return -1;
        }

        return 1;
    }
}
