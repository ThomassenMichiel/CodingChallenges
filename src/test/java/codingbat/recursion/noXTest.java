package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class noXTest {
    private NoX noX;
    
    @BeforeEach
    void setUp() {
        noX = new NoX();
    }
    
    @Test
    void first() {
        assertThat(
                noX.noX("xaxb")
        ).isEqualTo("ab");
    }
    
    @Test
    void second() {
        assertThat(noX.noX("abc")).isEqualTo("abc");
    }
    
    @Test
    void third() {
        assertThat(noX.noX("xx")).isEqualTo("");
    }
}
