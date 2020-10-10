package codingbat.functional2;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No9Test {
    @Test
    void first() {
        assertThat(new No9().no9(new ArrayList<>(List.of(1, 2, 19)))).isEqualTo(List.of(1, 2));
    }

    @Test
    void second() {
        assertThat(new No9().no9(new ArrayList<>(List.of(9, 19, 29, 3)))).isEqualTo(List.of(3));
    }

    @Test
    void third() {
        assertThat(new No9().no9(new ArrayList<>(List.of(1, 2, 3)))).isEqualTo(List.of(1, 2, 3));
    }
}
