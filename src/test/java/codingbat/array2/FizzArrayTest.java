package codingbat.array2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FizzArrayTest {
    @Test
    void first() {
        assertThat(new FizzArray().fizzArray(4)).isEqualTo(new int[]{0, 1, 2, 3});
    }

    @Test
    void second() {
        assertThat(new FizzArray().fizzArray(1)).isEqualTo(new int[]{0});
    }

    @Test
    void third() {
        assertThat(new FizzArray().fizzArray(10)).isEqualTo(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
}
