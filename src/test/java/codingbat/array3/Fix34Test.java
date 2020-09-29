package codingbat.array3;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Fix34Test {
    @Test
    void first() {
        assertThat(new Fix34().fix34(ArrayHelper.array(1, 3, 1, 4))).isEqualTo(ArrayHelper.array(1, 3, 4, 1));
    }

    @Test
    void second() {
        assertThat(new Fix34().fix34(ArrayHelper.array(1, 3, 1, 4, 4, 3, 1))).isEqualTo(ArrayHelper.array(1, 3, 4, 1, 1, 3, 4));
    }

    @Test
    void third() {
        assertThat(new Fix34().fix34(ArrayHelper.array(3, 2, 2, 4))).isEqualTo(ArrayHelper.array(3, 4, 2, 2));
    }
}