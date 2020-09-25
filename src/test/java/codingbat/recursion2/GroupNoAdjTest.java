package codingbat.recursion2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GroupNoAdjTest {
    @Test
    void first() {
        int[] intArray = {2, 5, 10, 4};
        boolean answer = new GroupNoAdj().groupNoAdj(0, intArray, 12);
        assertThat(answer).isTrue();
    }

    @Test
    void second() {
        int[] intArray = {2, 5, 10, 4};
        boolean answer = new GroupNoAdj().groupNoAdj(0, intArray, 14);
        assertThat(answer).isFalse();
    }

    @Test
    void third() {
        int[] intArray = {2, 5, 10, 4};
        boolean answer = new GroupNoAdj().groupNoAdj(0, intArray, 7);
        assertThat(answer).isFalse();
    }
}