package codewars.kyu7.guessthesequence;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Arrays;
// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void test0() {
        int[] result = {1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 16;
        String expected = Arrays.toString(result),
        actual = Arrays.toString(JomoPipi.sequence(x));
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 9;
        String expected = Arrays.toString(result),
        actual = Arrays.toString(JomoPipi.sequence(x));
        assertEquals(expected, actual);
    }
}
