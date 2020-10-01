package codingbat.array3;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CanBalanceTest {
    @Test
    void first() {
        assertThat(new CanBalance().canBalance(ArrayHelper.array(1, 1, 1, 2, 1))).isTrue();
    }

    @Test
    void second() {
        assertThat(new CanBalance().canBalance(ArrayHelper.array(2, 1, 1, 2, 1))).isFalse();
    }

    @Test
    void third() {
        assertThat(new CanBalance().canBalance(ArrayHelper.array(10, 10))).isTrue();
    }
}
