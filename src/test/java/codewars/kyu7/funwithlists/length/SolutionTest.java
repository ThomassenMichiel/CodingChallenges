package codewars.kyu7.funwithlists.length;

import codewars.kyu7.funwithlists.Helpers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    
    @Test
    public void basicTests() {
        assertEquals(0, Solution.length(null));
        assertEquals(4, Solution.length(Helpers.listFromArray(1, 2, 3, 4)));
    }
}
