package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Array11Test {
    private Array11 array11;
    
    @BeforeEach
    void setUp() {
        array11 = new Array11();
    }
    
    @Test
    void first() {
        assertThat(array11.array11(new int[]{1, 2, 11}, 0)).isEqualTo(1);
    }
    
    @Test
    void second() {
        assertThat(array11.array11(new int[]{11, 11}, 0)).isEqualTo(2);
    }
    
    @Test
    void third() {
        assertThat(array11.array11(new int[]{1, 2, 3, 4}, 0)).isEqualTo(0);
    }
}
