package codewars.kyu6.funwithlists.countif;

import codewars.kyu7.funwithlists.Helpers;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    
    @Test
    public void basicTests() {
        assertEquals(0, Solution.countIf(null, __ -> false));
        assertEquals(3, Solution.countIf(Helpers.listFromArray(1, 2, 3), __ -> true));
    }
    
    @Test
    public void arrayOfInts() {
        assertEquals(2, Solution.countIf(Helpers.listFromArray(1, 2, 3), x -> (int) x <= 2));
    }
}
