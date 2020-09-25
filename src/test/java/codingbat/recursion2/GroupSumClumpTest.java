package codingbat.recursion2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GroupSumClumpTest {
    @Test
    void first() {
        int[] intArray = {2, 4, 8};
        boolean answer = new GroupSumClump().groupSumClump(0, intArray, 10);
        assertThat(answer).isTrue();
    }

    @Test
    void second() {
        int[] intArray = {1, 2, 4, 8, 1};
        boolean answer = new GroupSumClump().groupSumClump(0, intArray, 14);
        assertThat(answer).isTrue();
    }

    @Test
    void third() {
        int[] intArray = {2, 4, 4, 8};
        boolean answer = new GroupSumClump().groupSumClump(0, intArray, 14);
        assertThat(answer).isFalse();
    }

    @Test
    void fourth() {
        int[] intArray = {1, 2, 4, 8, 1};
        boolean answer = new GroupSumClump().groupSumClump(0, intArray, 14);
        assertThat(answer).isTrue();
    }
}