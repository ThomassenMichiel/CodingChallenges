package codewars.kyu6.funwithlists.filter;

import codewars.kyu6.funwithlists.Helpers;
import codewars.kyu7.funwithlists.Node;
import org.junit.Test;

public class SolutionTest {
    
    // Helpers.testFilter(input_list_head, predicate, expected_list_head)
    
    @Test
    public void basicTests() {
        Helpers.testFilter(null, __ -> false, null);
        Helpers.testFilter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> true, new Node<>(1, new Node<>(2, new Node<>(3))));
    }
    
    @Test
    public void arrayOfInts() {
        Helpers.testFilter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> (int) x <= 2, new Node<>(1, new Node<>(2)));
        Helpers.testFilter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> (int) x == 1, new Node<>(1));
    }
}
