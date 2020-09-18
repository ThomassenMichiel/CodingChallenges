package codingbat.array2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzArray2Test {
    @Test
    void first() {
        assertThat(new FizzArray2().fizzArray2(4)).isEqualTo(new String[]{"0", "1", "2", "3"});
    }

    @Test
    void second() {
        assertThat(new FizzArray2().fizzArray2(1)).isEqualTo(new String[]{"0"});
    }

    @Test
    void third() {
        assertThat(new FizzArray2().fizzArray2(10)).isEqualTo(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
    }
}
