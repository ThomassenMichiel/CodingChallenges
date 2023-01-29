package codewars.kyu8.function2squaringanargument;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void fixed_tests() {
        assertEquals(4, Kata.square(2));
        assertEquals(2500, Kata.square(50));
        assertEquals(1, Kata.square(1));
    }
}

