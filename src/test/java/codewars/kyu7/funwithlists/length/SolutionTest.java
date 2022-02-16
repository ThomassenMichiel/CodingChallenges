package codewars.kyu7.funwithlists.length;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    
    @Test
    public void basicTests() {
        assertEquals(0, Solution.length(null));
        Node<?> node4 = new Node<>(4);
        Node<?> node3 = new Node<>(3, node4);
        Node<?> node2 = new Node<>(2, node3);
        Node<?> node = new Node<>(1, node2);
        assertEquals(4, Solution.length(node));
    }
}
