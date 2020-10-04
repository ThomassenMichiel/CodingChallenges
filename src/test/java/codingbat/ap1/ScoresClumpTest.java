package codingbat.ap1;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScoresClumpTest {
    @Test
    void first() {
        assertThat(new ScoresClump().scoresClump(ArrayHelper.array(3, 4, 5))).isTrue();
    }

    @Test
    void second() {
        assertThat(new ScoresClump().scoresClump(ArrayHelper.array(3, 4, 6))).isFalse();
    }

    @Test
    void third() {
        assertThat(new ScoresClump().scoresClump(ArrayHelper.array(1, 3, 5, 5))).isTrue();
    }
}
