package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Sum28Test {

    @Test
    void first() {
        assertThat(new Sum28().sum28(ArrayHelper.array(2, 3, 2, 2, 4, 2))).isTrue();
    }

    @Test
    void second() {
        assertThat(new Sum28().sum28(ArrayHelper.array(2, 3, 2, 2, 4, 2, 2))).isFalse();
    }

    @Test
    void third() {
        assertThat(new Sum28().sum28(ArrayHelper.array(1, 2, 3, 4))).isFalse();
    }
}