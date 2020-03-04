package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PairStarTest {
    private PairStar pairStar;
    
    @BeforeEach
    void setUp() {
        pairStar = new PairStar();
    }
    
    @Test
    void first() {
        assertThat(pairStar.pairStar("hello")).isEqualTo("hel*lo");
    }
    
    @Test
    void second() {
        assertThat(pairStar.pairStar("xxyy")).isEqualTo("x*xy*y");
    }
    
    @Test
    void third() {
        assertThat(pairStar.pairStar("aaaa")).isEqualTo("a*a*a*a");
    }
}
