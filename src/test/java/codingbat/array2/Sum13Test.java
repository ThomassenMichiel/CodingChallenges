package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Sum13Test {

    @Test
    void first() {
        assertThat(new Sum13().sum13(ArrayHelper.array(1, 2, 2, 1))).isEqualTo(6);
    }

    @Test
    void second() {
        assertThat(new Sum13().sum13(ArrayHelper.array(1, 1))).isEqualTo(2);
    }

    @Test
    void third() {
        assertThat(new Sum13().sum13(ArrayHelper.array(1, 2, 2, 1, 13))).isEqualTo(6);
    }
}