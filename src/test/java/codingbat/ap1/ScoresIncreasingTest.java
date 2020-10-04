package codingbat.ap1;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScoresIncreasingTest {
    @Test
    void first() {
        assertThat(new ScoresIncreasing().scoresIncreasing(ArrayHelper.array(1, 3, 4))).isTrue();
    }

    @Test
    void second() {
        assertThat(new ScoresIncreasing().scoresIncreasing(ArrayHelper.array(1, 3, 2))).isFalse();
    }

    @Test
    void third() {
        assertThat(new ScoresIncreasing().scoresIncreasing(ArrayHelper.array(1, 1, 4))).isTrue();
    }
}
