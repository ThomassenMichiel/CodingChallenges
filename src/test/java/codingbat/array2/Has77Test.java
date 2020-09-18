package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Has77Test {
    @Test
    void first() {
        assertThat(new Has77().has77(ArrayHelper.array(1, 7, 7))).isTrue();
    }

    @Test
    void second() {
        assertThat(new Has77().has77(ArrayHelper.array(1, 7, 1, 7))).isTrue();
    }

    @Test
    void third() {
        assertThat(new Has77().has77(ArrayHelper.array(1, 7, 1, 1, 7))).isFalse();
    }
}