package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Count11Test {
    
    private Count11 count11;
    
    @BeforeEach
    void setUp() {
        count11 = new Count11();
    }
    
    @Test
    void first() {
        assertThat(count11.count11("11abc11")).isEqualTo(2);
    }
    
    @Test
    void second() {
        assertThat(count11.count11("abc11x11x11")).isEqualTo(3);
    }
    
    @Test
    void third() {
        assertThat(count11.count11("111")).isEqualTo(1);
    }
}
