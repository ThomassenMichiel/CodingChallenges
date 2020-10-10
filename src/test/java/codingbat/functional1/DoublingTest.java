package codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

class DoublingTest {
    @Test
    void first() {
        assertThat(new Doubling().doubling(new ArrayList<>(List.of(1, 2, 3)))).isEqualTo(List.of(2, 4, 6));
    }

    @Test
    void second() {
        assertThat(new Doubling().doubling(new ArrayList<>(List.of(6, 8, 6, 8, -1)))).isEqualTo(List.of(12, 16, 12, 16, -2));
    }

    @Test
    void third() {
        assertThat(new Doubling().doubling(new ArrayList<>())).isEqualTo(emptyList());
    }
}
