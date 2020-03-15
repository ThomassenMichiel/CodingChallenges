package codingbat.recursion2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GroupSumTest {
    private GroupSum groupSum;
    
    @BeforeEach
    void setUp() {
        groupSum = new GroupSum();
    }
    
    @Test
    void first() {
        assertThat(groupSum.groupSum(0, new int[]{2,4,8}, 10)).isTrue();
    }
    
    @Test
    void second() {
        assertThat(groupSum.groupSum(0, new int[]{2,4,8}, 14)).isTrue();
    }
    
    @Test
    void third() {
        assertThat(groupSum.groupSum(0, new int[]{2,4,8}, 9)).isFalse();
    }
}
