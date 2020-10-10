package codingbat.functional2;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Square56Test {
    @Test
    void first() {
        assertThat(new Square56().square56(new ArrayList<>(List.of(3, 1, 4)))).isEqualTo(List.of(19, 11));
    }

    @Test
    void second() {
        assertThat(new Square56().square56(new ArrayList<>(List.of(1)))).isEqualTo(List.of(11));
    }

    @Test
    void third() {
        assertThat(new Square56().square56(new ArrayList<>(List.of(2)))).isEqualTo(List.of(14));
    }
}
