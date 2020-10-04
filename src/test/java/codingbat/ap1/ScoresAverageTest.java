package codingbat.ap1;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScoresAverageTest {
    @Test
    void first() {
        assertThat(new ScoresAverage().scoresAverage(ArrayHelper.array(2, 2, 4, 4))).isEqualTo(4);
    }

    @Test
    void second() {
        assertThat(new ScoresAverage().scoresAverage(ArrayHelper.array(4, 4, 4, 2, 2, 2))).isEqualTo(4);
    }

    @Test
    void third() {
        assertThat(new ScoresAverage().scoresAverage(ArrayHelper.array(3, 4, 5, 1, 2, 3))).isEqualTo(4);
    }
}
