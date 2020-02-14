package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void fixedTests() {
        assertEquals("f", AlphabeticalAddition.addLetters("a", "b", "c"));
        assertEquals("z", AlphabeticalAddition.addLetters("z"));
        assertEquals("c", AlphabeticalAddition.addLetters("a", "b"));
        assertEquals("c", AlphabeticalAddition.addLetters("c"));
        assertEquals("a", AlphabeticalAddition.addLetters("z", "a"));
        assertEquals("d", AlphabeticalAddition.addLetters("y", "c", "b"));
        assertEquals("z", AlphabeticalAddition.addLetters());
        assertEquals("z", AlphabeticalAddition.addLetters("m","y","n"));
    }
}
