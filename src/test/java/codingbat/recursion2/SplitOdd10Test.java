package codingbat.recursion2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SplitOdd10Test {

    @Test
    void first() {
        boolean answer = new SplitOdd10().splitOdd10(new int[]{5, 5, 5});
        assertThat(answer).isTrue();
    }

    @Test
    void second() {
        boolean answer = new SplitOdd10().splitOdd10(new int[]{5, 5, 6});
        assertThat(answer).isFalse();
    }

    @Test
    void third() {
        boolean answer = new SplitOdd10().splitOdd10(new int[]{5, 5, 6, 1});
        assertThat(answer).isTrue();
    }
}