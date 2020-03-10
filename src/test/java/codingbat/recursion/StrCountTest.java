package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StrCountTest {
    
    private StrCount strCount;
    
    @BeforeEach
    void setUp() {
        strCount = new StrCount();
    }
    
    @Test
    void first() {
        assertThat(strCount.strCount("catcowcat", "cat")).isEqualTo(2);
    }
    
    @Test
    void second() {
        assertThat(strCount.strCount("catcowcat", "cow")).isEqualTo(1);
    }
    
    @Test
    void third() {
        assertThat(strCount.strCount("catcowcat", "dog")).isEqualTo(0);
    }
}
