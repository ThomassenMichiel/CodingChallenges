package codewars.kyu7.findthenextperfectsquare;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class FindNextSquareTest {
    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }
    
    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }
    
    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }
    
    
}
