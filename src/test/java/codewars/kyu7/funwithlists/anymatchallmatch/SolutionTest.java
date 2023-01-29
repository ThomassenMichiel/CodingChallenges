package codewars.kyu7.funwithlists.anymatchallmatch;

import codewars.kyu7.funwithlists.Helpers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    
    @Test
    public void basicTests() {
        assertEquals(false, Solution.anyMatch(null, __ -> false));
        assertEquals(false, Solution.anyMatch(null, __ -> true));
        assertEquals(true, Solution.allMatch(null, __ -> false));
        assertEquals(true, Solution.allMatch(null, __ -> true));
    }
    
    @Test
    public void arrayOfInts() {
        assertEquals(true, Solution.anyMatch(Helpers.listFromArray(1, 2, 3), x -> (int) x > 1));
        assertEquals(false, Solution.allMatch(Helpers.listFromArray(1, 2, 3), x -> (int) x > 1));
    }
    
}
