package codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Math1Test {
    @Test
    void first() {
        assertThat(new Math1().math1(new ArrayList<>(List.of(1, 2, 3)))).isEqualTo(List.of(20, 30, 40));
    }

    @Test
    void second() {
        assertThat(new Math1().math1(new ArrayList<>(List.of(6, 8, 6, 8, 1)))).isEqualTo(List.of(70, 90, 70, 90, 20));
    }

    @Test
    void third() {
        assertThat(new Math1().math1(new ArrayList<>(List.of(10)))).isEqualTo(List.of(110));
    }
}
