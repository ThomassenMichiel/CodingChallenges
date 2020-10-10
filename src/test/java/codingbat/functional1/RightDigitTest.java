package codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RightDigitTest {
    @Test
    void first() {
        assertThat(new RightDigit().rightDigit(new ArrayList<>(List.of(1, 22, 93)))).isEqualTo(List.of(1, 2, 3));
    }

    @Test
    void second() {
        assertThat(new RightDigit().rightDigit(new ArrayList<>(List.of(16, 8, 886, 8, 1)))).isEqualTo(List.of(6, 8, 6, 8, 1));
    }

    @Test
    void third() {
        assertThat(new RightDigit().rightDigit(new ArrayList<>(List.of(10, 0)))).isEqualTo(List.of(0, 0));
    }
}
