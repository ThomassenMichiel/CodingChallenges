package codingbat.array2;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NotAloneTest {
    @Test
    void first() {
        assertThat(new NotAlone().notAlone(ArrayHelper.array(1, 2, 3), 2)).isEqualTo(ArrayHelper.array(1, 3, 3));
    }

    @Test
    void second() {
        assertThat(new NotAlone().notAlone(ArrayHelper.array(1, 2, 3, 2, 5, 2), 2)).isEqualTo(ArrayHelper.array(1, 3, 3, 5, 5, 2));
    }

    @Test
    void third() {
        assertThat(new NotAlone().notAlone(ArrayHelper.array(3, 4), 3)).isEqualTo(ArrayHelper.array(3, 4));
    }
}
