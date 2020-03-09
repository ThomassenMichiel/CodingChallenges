package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountAbcTest {
    private CountAbc countAbc;
    
    @BeforeEach
    void setUp() {
        countAbc = new CountAbc();
    }
    
    @Test
    void first() {
        assertThat(countAbc.countAbc("abc")).isEqualTo(1);
    }
    
    @Test
    void second() {
        assertThat(countAbc.countAbc("abcxxabc")).isEqualTo(2);
    }
    
    @Test
    void third() {
        assertThat(countAbc.countAbc("abaxxaba")).isEqualTo(2);
    }
}
