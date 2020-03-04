package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AllStarTest {
    private AllStar allStar;
    
    @BeforeEach
    void setUp() {
        allStar = new AllStar();
    }
    
    @Test
    void first() {
        assertThat(allStar.allStar("hello")).isEqualTo("h*e*l*l*o");
    }
    
    @Test
    void second() {
        assertThat(allStar.allStar("abc")).isEqualTo("a*b*c");
    }
    
    @Test
    void third() {
        assertThat(allStar.allStar("ab")).isEqualTo("a*b");
    }
}
