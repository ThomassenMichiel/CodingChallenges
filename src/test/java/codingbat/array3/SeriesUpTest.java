package codingbat.array3;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SeriesUpTest {
    @Test
    void first() {
        assertThat(new SeriesUp().seriesUp(3)).isEqualTo(ArrayHelper.array(1, 1, 2, 1, 2, 3));
    }

    @Test
    void second() {
        assertThat(new SeriesUp().seriesUp(2)).isEqualTo(ArrayHelper.array(1, 1, 2, 1, 2, 3, 1, 2, 3, 4));
    }

    @Test
    void third() {
        assertThat(new SeriesUp().seriesUp(4)).isEqualTo(ArrayHelper.array(1, 1, 2));
    }
}