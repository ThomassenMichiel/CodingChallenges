package codingbat.array3;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxMirrorTest {
    @Test
    void first() {
        assertThat(new MaxMirror().maxMirror(ArrayHelper.array(1, 2, 3, 8, 9, 3, 2, 1))).isEqualTo(3);
    }

    @Test
    void second() {
        assertThat(new MaxMirror().maxMirror(ArrayHelper.array(1, 2, 1, 4))).isEqualTo(3);
    }

    @Test
    void third() {
        assertThat(new MaxMirror().maxMirror(ArrayHelper.array(7, 1, 2, 9, 7, 2, 1))).isEqualTo(2);
    }
}
