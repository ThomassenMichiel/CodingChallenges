package codingbat.array2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzArray3Test {
    @Test
    void first() {
        assertThat(new FizzArray3().fizzArray3(5, 10)).isEqualTo(new int[]{5,6,7,8,9});
    }

    @Test
    void second() {
        assertThat(new FizzArray3().fizzArray3(11, 18)).isEqualTo(new int[]{11,12,13,14,15,16,17});
    }

    @Test
    void third() {
        assertThat(new FizzArray3().fizzArray3(1, 3)).isEqualTo(new int[]{1, 2});
    }
}
