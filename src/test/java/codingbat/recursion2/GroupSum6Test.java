package codingbat.recursion2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GroupSum6Test {

    @Test
    void first() {
        int[] intArray = {5, 6, 2};
        boolean answer = new GroupSum6().groupSum6(0, intArray, 8);
        assertThat(answer).isTrue();
    }

    @Test
    void second() {
        int[] intArray = {5, 6, 2};
        boolean answer = new GroupSum6().groupSum6(0, intArray, 9);
        assertThat(answer).isFalse();
    }

    @Test
    void third() {
        int[] intArray = {5, 6, 2};
        boolean answer = new GroupSum6().groupSum6(0, intArray, 7);
        assertThat(answer).isFalse();
    }
}