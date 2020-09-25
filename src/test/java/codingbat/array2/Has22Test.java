package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Has22Test {
    @Test
    void first() {
        assertThat(new Has22().has22(ArrayHelper.array(1, 2, 2))).isTrue();
    }

    @Test
    void second() {
        assertThat(new Has22().has22(ArrayHelper.array(1, 2, 1, 2))).isFalse();
    }

    @Test
    void third() {
        assertThat(new Has22().has22(ArrayHelper.array(2, 1, 2))).isFalse();
    }
}