package codewars.kyu8.unexpectedparsing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals("busy", Kata.getStatus(true).get("status"));
        assertEquals("available", Kata.getStatus(false).get("status"));
    }
}
