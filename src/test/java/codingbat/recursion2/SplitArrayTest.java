package codingbat.recursion2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SplitArrayTest {

    @Test
    void first() {
        boolean answer = new SplitArray().splitArray(new int[]{2, 2});
        assertThat(answer).isTrue();
    }

    @Test
    void second() {
        boolean answer = new SplitArray().splitArray(new int[]{2, 3});
        assertThat(answer).isFalse();
    }

    @Test
    void third() {
        boolean answer = new SplitArray().splitArray(new int[]{5, 2, 3});
        assertThat(answer).isTrue();
    }
}