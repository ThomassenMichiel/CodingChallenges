package codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {
    @Test
    void first() {
        assertThat(new Square().square(new ArrayList<>(List.of(1, 2, 3)))).isEqualTo(List.of(1,4,9));
    }

    @Test
    void second() {
        assertThat(new Square().square(new ArrayList<>(List.of(6, 8, 6, 8, -1)))).isEqualTo(List.of(36, 64, 36, 64, 1));
    }

    @Test
    void third() {
        assertThat(new Square().square(new ArrayList<>())).isEqualTo(emptyList());
    }
}
