package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EvenOddTest {
    @Test
    void first() {
        assertThat(new EvenOdd().evenOdd(ArrayHelper.array(1, 0, 1, 0, 0, 1, 1))).isEqualTo(new int[]{0, 0, 0, 1, 1, 1, 1});
    }

    @Test
    void second() {
        assertThat(new EvenOdd().evenOdd(ArrayHelper.array(3, 3, 2))).isEqualTo(new int[]{2, 3, 3});
    }

    @Test
    void third() {
        assertThat(new EvenOdd().evenOdd(ArrayHelper.array(2, 2, 2))).isEqualTo(new int[]{2, 2, 2});
    }
}
