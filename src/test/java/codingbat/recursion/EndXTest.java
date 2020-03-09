package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EndXTest {
    private EndX endX;
    
    @BeforeEach
    void setUp() {
        endX = new EndX();
    }
    
    @Test
    void first() {
        assertThat(endX.endX("xxre")).isEqualTo("rexx");
    }
    
    @Test
    void second() {
        assertThat(endX.endX("xxhixx")).isEqualTo("hixxxx");
    }
    
    @Test
    void third() {
        assertThat(endX.endX("xhixhix")).isEqualTo("hihixxx");
    }
}
