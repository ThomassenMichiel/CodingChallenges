package codingbat.array2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    @Test
    void first() {
        assertThat(new FizzBuzz().fizzBuzz(1,6)).isEqualTo(new String[]{"1", "2", "Fizz", "4", "Buzz"});
    }

    @Test
    void second() {
        assertThat(new FizzBuzz().fizzBuzz(1,8)).isEqualTo(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"});
    }

    @Test
    void third() {
        assertThat(new FizzBuzz().fizzBuzz(1,11)).isEqualTo(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"});
    }
}
