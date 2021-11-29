package codewars.kyu7.friends;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void shouldWorkForExampleTestCases() {
        assertEquals(0, Friends.friends(0));
        assertEquals(0, Friends.friends(1));
        assertEquals(0, Friends.friends(2));
    }
    
    @Test
    public void test() {
        assertEquals(1, Friends.friends(4));
        assertEquals(11, Friends.friends(2570));
        assertEquals(26, Friends.friends(103394650));
        assertEquals(26, Friends.friends(89827204));
        assertEquals(3, Friends.friends(16));
    }
}

