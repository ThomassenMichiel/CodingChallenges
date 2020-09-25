package codingbat.array2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BigDiffTest {
    @Test
    void first() {
        int answer = new BigDiff().bigDiff(new int[]{10, 3, 5, 6});
        assertThat(answer).isEqualTo(7);
    }

    @Test
    void second() {
        int answer = new BigDiff().bigDiff(new int[]{7, 2, 10, 9});
        assertThat(answer).isEqualTo(8);
    }

    @Test
    void third() {
        int answer = new BigDiff().bigDiff(new int[]{2, 10, 7, 2});
        assertThat(answer).isEqualTo(8);
    }
}