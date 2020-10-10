package codingbat.functional2;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Two2Test {
    @Test
    void first() {
        assertThat(new Two2().two2(new ArrayList<>(List.of(1, 2, 3)))).isEqualTo(List.of(4, 6));
    }

    @Test
    void second() {
        assertThat(new Two2().two2(new ArrayList<>(List.of(2, 6, 11)))).isEqualTo(List.of(4));
    }

    @Test
    void third() {
        assertThat(new Two2().two2(new ArrayList<>(List.of(0)))).isEqualTo(List.of(0));
    }
}
