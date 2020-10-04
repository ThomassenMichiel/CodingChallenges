package codingbat.ap1;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CopyEvensTest {
    @Test
    void first() {
        assertThat(new CopyEvens().copyEvens(ArrayHelper.array(3, 2, 4, 5, 8), 2)).isEqualTo(ArrayHelper.array(2, 4));
    }

    @Test
    void second() {
        assertThat(new CopyEvens().copyEvens(ArrayHelper.array(3, 2, 4, 5, 8), 3)).isEqualTo(ArrayHelper.array(2, 4, 8));
    }

    @Test
    void third() {
        assertThat(new CopyEvens().copyEvens(ArrayHelper.array(6, 1, 2, 4, 5, 8), 3)).isEqualTo(ArrayHelper.array(6, 2, 4));
    }
}
