package codingbat.recursion2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GroupSum5Test {
    @Test
    void first() {
        int[] intArray = {2, 5, 10, 4};
        boolean answer = new GroupSum5().groupSum5(0, intArray, 19);
        assertThat(answer).isTrue();
    }

    @Test
    void second() {
        int[] intArray = {2, 5, 10, 4};
        boolean answer = new GroupSum5().groupSum5(0, intArray, 17);
        assertThat(answer).isTrue();
    }

    @Test
    void third() {
        int[] intArray = {2, 5, 10, 4};
        boolean answer = new GroupSum5().groupSum5(0, intArray, 12);
        assertThat(answer).isFalse();
    }

    @Test
    void fourth() {
        int[] intArray = {3, 5, 1};
        boolean answer = new GroupSum5().groupSum5(0, intArray, 9);
        assertThat(answer).isFalse();
    }
}