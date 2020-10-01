package codingbat.array3;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Fix45Test {
    @Test
    void first() {
        assertThat(new Fix45().fix45(ArrayHelper.array(5, 4, 9, 4, 9, 5))).isEqualTo(ArrayHelper.array(9, 4, 5, 4, 5, 9));
    }

    @Test
    void second() {
        assertThat(new Fix45().fix45(ArrayHelper.array(1, 4, 1, 5))).isEqualTo(ArrayHelper.array(1, 4, 5, 1));
    }

    @Test
    void third() {
        assertThat(new Fix45().fix45(ArrayHelper.array(1, 4, 1, 5, 5, 4, 1))).isEqualTo(ArrayHelper.array(1, 4, 5, 1, 1, 4, 5));
    }
}
