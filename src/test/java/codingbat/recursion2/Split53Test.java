package codingbat.recursion2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Split53Test {

    @Test
    void first() {
        boolean answer = new Split53().split53(new int[]{1, 1});
        assertThat(answer).isTrue();
    }

    @Test
    void second() {
        boolean answer = new Split53().split53(new int[]{1, 1, 1});
        assertThat(answer).isFalse();
    }

    @Test
    void third() {
        boolean answer = new Split53().split53(new int[]{2, 4, 2});
        assertThat(answer).isTrue();
    }
}