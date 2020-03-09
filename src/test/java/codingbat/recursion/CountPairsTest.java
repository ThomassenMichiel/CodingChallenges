package codingbat.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountPairsTest {
    private CountPairs countPairs;
    
    @BeforeEach
    void setUp() {
        countPairs = new CountPairs();
    }
    
    @Test
    void first() {
        assertThat(countPairs.countPairs("axa")).isEqualTo(1);
    }
    
    @Test
    void second() {
        assertThat(countPairs.countPairs("axax")).isEqualTo(2);
    }
    
    @Test
    void third() {
        assertThat(countPairs.countPairs("axbx")).isEqualTo(1);
    }
}
