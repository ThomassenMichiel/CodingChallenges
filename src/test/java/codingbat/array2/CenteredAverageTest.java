package codingbat.array2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CenteredAverageTest {
    @Test
    void first() {
        int answer = new CenteredAverage().centeredAverage(new int[]{1, 2, 3, 4, 100});
        assertThat(answer).isEqualTo(3);
    }

    @Test
    void second() {
        int answer = new CenteredAverage().centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7});
        assertThat(answer).isEqualTo(5);
    }

    @Test
    void third() {
        int answer = new CenteredAverage().centeredAverage(new int[]{-10, -4, -2, -4, -2, 0});
        assertThat(answer).isEqualTo(-3);
    }
}