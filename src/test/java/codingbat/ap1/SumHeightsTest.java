package codingbat.ap1;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumHeightsTest {
    @Test
    void first() {
        assertThat(new SumHeights().sumHeights(ArrayHelper.array(5, 3, 6, 7, 2), 2, 4)).isEqualTo(6);
    }


    @Test
    void second() {
        assertThat(new SumHeights().sumHeights(ArrayHelper.array(5, 3, 6, 7, 2), 0, 1)).isEqualTo(2);
    }

    @Test
    void third() {
        assertThat(new SumHeights().sumHeights(ArrayHelper.array(5, 3, 6, 7, 2), 0, 4)).isEqualTo(11);
    }
}
