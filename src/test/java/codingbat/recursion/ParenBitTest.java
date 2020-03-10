package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ParenBitTest {
    private ParenBit parenBit;
    
    @BeforeEach
    void setUp() {
        parenBit = new ParenBit();
    }
    
    @Test
    void first() {
        assertThat(parenBit.parenBit("xyz(abc)123")).isEqualTo("(abc)");
    }
    
    @Test
    void second() {
        assertThat(parenBit.parenBit("x(hello)")).isEqualTo("(hello)");
    }
    
    @Test
    void third() {
        assertThat(parenBit.parenBit("(xy)1")).isEqualTo("(xy)");
    }
}
