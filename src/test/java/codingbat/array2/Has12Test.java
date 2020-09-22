package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Has12Test {
    @Test
    void first() {
        assertThat(new Has12().has12(ArrayHelper.array(1, 3, 2))).isTrue();
    }

    @Test
    void second() {
        assertThat(new Has12().has12(ArrayHelper.array(3, 1, 2))).isTrue();
    }

    @Test
    void third() {
        assertThat(new Has12().has12(ArrayHelper.array(3, 1, 4, 5, 2))).isTrue();
    }
}