package codingbat.ap1;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BigHeightsTest {
    @Test
    void first() {
        assertThat(new BigHeights().bigHeights(ArrayHelper.array(5, 3, 6, 7, 2), 2, 4)).isEqualTo(1);
    }


    @Test
    void second() {
        assertThat(new BigHeights().bigHeights(ArrayHelper.array(5, 3, 6, 7, 2), 0, 1)).isEqualTo(0);
    }

    @Test
    void third() {
        assertThat(new BigHeights().bigHeights(ArrayHelper.array(5, 3, 6, 7, 2), 0, 4)).isEqualTo(1);
    }
}
