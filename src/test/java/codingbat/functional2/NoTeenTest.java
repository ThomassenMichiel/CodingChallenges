package codingbat.functional2;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

class NoTeenTest {
    @Test
    void first() {
        assertThat(new NoTeen().noTeen(new ArrayList<>(List.of(12, 13, 19, 20)))).isEqualTo(List.of(12, 20));
    }

    @Test
    void second() {
        assertThat(new NoTeen().noTeen(new ArrayList<>(List.of(1, 14, 1)))).isEqualTo(List.of(1, 1));
    }

    @Test
    void third() {
        assertThat(new NoTeen().noTeen(new ArrayList<>(List.of(15)))).isEqualTo(emptyList());
    }
}
