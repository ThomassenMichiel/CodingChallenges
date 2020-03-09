package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountHi2Test {
    private CountHi2 countHi2;
    
    @BeforeEach
    void setUp() {
        countHi2 = new CountHi2();
    }
    
    @Test
    void first() {
        assertThat(countHi2.countHi2("ahixhi")).isEqualTo(1);
    }
    
    @Test
    void second() {
        assertThat(countHi2.countHi2("ahibhi")).isEqualTo(2);
    }
    
    @Test
    void third() {
        assertThat(countHi2.countHi2("xhixhi")).isEqualTo(0);
    }
    
    @Test
    void fourth() {
        assertThat(countHi2.countHi2("hi")).isEqualTo(1);
    }
}
