package codingbat.recursion2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GroupSumTest {

    @Test
    void first() {
        int[] intArray = {2, 4, 8};
        boolean answer = new GroupSum().groupSum(0, intArray, 10);
        assertThat(answer).isTrue();
    }

    @Test
    void second() {
        int[] intArray = {2, 4, 8};
        boolean answer = new GroupSum().groupSum(0, intArray, 14);
        assertThat(answer).isTrue();
    }

    @Test
    void third() {
        int[] intArray = {2, 4, 8};
        boolean answer = new GroupSum().groupSum(0, intArray, 9);
        assertThat(answer).isFalse();
    }

    @Test
    void fourth() {
        int[] intArray = {2, 4, 8};
        boolean answer = new GroupSum().groupSum(1, intArray, 2);
        assertThat(answer).isFalse();
    }

    @Test
    void fifth() {
        int[] intArray = {10, 2, 2, 5};
        boolean answer = new GroupSum().groupSum(0, intArray, 17);
        assertThat(answer).isTrue();
    }
}