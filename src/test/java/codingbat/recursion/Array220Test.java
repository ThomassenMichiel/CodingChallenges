package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Array220Test {
    private Array220 array220;
    
    @BeforeEach
    void setUp() {
        array220 = new Array220();
    }
    
    @Test
    void first() {
        assertTrue(array220.array220(new int[]{1, 2, 20}, 0));
    }
    
    @Test
    void second() {
        assertTrue(array220.array220(new int[]{3, 30}, 0));
    }
    
    @Test
    void third() {
        assertFalse(array220.array220(new int[]{3}, 0));
    }
}
