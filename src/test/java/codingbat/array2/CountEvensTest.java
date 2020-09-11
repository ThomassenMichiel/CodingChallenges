package codingbat.array2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountEvensTest {

    @Test
    void first() {
        int answer = new CountEvens().countEvens(new int[]{2, 1, 2, 3, 4});
        assertThat(answer).isEqualTo(3);
    }

    @Test
    void second() {
        int answer = new CountEvens().countEvens(new int[]{2, 2, 0});
        assertThat(answer).isEqualTo(3);
    }

    @Test
    void third() {
        int answer = new CountEvens().countEvens(new int[]{1, 3, 5});
        assertThat(answer).isEqualTo(0);
    }
}