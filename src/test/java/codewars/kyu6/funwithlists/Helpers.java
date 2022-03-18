package codewars.kyu6.funwithlists;

import codewars.kyu6.funwithlists.filter.Solution;
import codewars.kyu7.funwithlists.Node;
import org.junit.jupiter.api.Assertions;

import java.util.function.Predicate;

public class Helpers {
    
    
    public static void testFilter(Node inputListHead, Predicate p, Node expectedListHead) {
        Assertions.assertEquals(expectedListHead,Solution.filter(inputListHead, p));
    }
}
