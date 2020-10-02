package codingbat.array3;

import codingbat.ArrayHelper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareUpTest {
    @Test
    void first() {
        assertThat(new SquareUp().squareUp(3)).isEqualTo(ArrayHelper.array(0, 0, 1, 0, 2, 1, 3, 2, 1));
    }

    @Test
    void second() {
        assertThat(new SquareUp().squareUp(2)).isEqualTo(ArrayHelper.array(0, 1, 2, 1));
    }

    @Test
    void third() {
        assertThat(new SquareUp().squareUp(4)).isEqualTo(ArrayHelper.array(0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1));
    }
}