package codewars.kyu7.findthestraynumber;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    
    @Test
    public void simpleArray1() {
        assertEquals(2, getActualFor(1, 1, 2));
    }
    
    @Test
    public void firstNumber() {
        assertEquals(8, getActualFor(8,1,1,1,1));
    }
    
    private int getActualFor(int... numbers) {
        return Solution.stray(numbers);
    }
}
