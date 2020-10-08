package codingbat.ap1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonTwo {
    public int commonTwo(String[] a, String[] b) {
        Set<String> elementsA = new HashSet<>(Arrays.asList(a));
        Set<String> elementsB = new HashSet<>(Arrays.asList(b));
        Set<String> both = new HashSet<>();

        for (String stringA : elementsA) {
            if (elementsB.contains(stringA)) {
                both.add(stringA);
            }
        }

        return both.size();
    }
}
