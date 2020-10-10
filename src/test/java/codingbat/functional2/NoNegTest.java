package codingbat.functional2;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

class NoNegTest {
    @Test
    void first() {
        assertThat(new NoNeg().noNeg(new ArrayList<>(List.of(1, -2)))).isEqualTo(List.of(1));
    }

    @Test
    void second() {
        assertThat(new NoNeg().noNeg(new ArrayList<>(List.of(-3, -3, 3, 3)))).isEqualTo(List.of(3,3));
    }

    @Test
    void third() {
        assertThat(new NoNeg().noNeg(new ArrayList<>(List.of(-1, -1, -1)))).isEqualTo(emptyList());
    }
}
