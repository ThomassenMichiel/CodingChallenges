package codingbat.ap1;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Scores100Test {
    @Test
    void first() {
        assertThat(new Scores100().scores100(ArrayHelper.array(1, 100, 100))).isTrue();
    }

    @Test
    void second() {
        assertThat(new Scores100().scores100(ArrayHelper.array(1, 100, 99, 100))).isFalse();
    }

    @Test
    void third() {
        assertThat(new Scores100().scores100(ArrayHelper.array(100, 1, 100, 100))).isTrue();
    }
}
