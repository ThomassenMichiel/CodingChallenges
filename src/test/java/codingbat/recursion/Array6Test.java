package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Array6Test {
    private Array6 array6;
    
    @BeforeEach
    void setUp() {
        this.array6 = new Array6();
    }
    
    @Test
    void first() {
        assertTrue(array6.array6(new int[]{1, 6, 7},0));
    }
    
    @Test
    void second() {
        assertFalse(array6.array6(new int[]{1, 4},0));
    }
    
    @Test
    void third() {
        assertTrue(array6.array6(new int[]{6},0));
    }
}
