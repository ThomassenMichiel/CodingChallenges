package codingbat.map2;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class PairsTest {
    @Test
    void first() {
        assertThat(new Pairs().pairs(new String[]{"code", "bug"})).isEqualTo(Map.of("b", "g", "c", "e"));
    }

    @Test
    void second() {
        assertThat(new Pairs().pairs(new String[]{"man", "moon", "main"})).isEqualTo(Map.of("m", "n"));
    }

    @Test
    void third() {
        assertThat(new Pairs().pairs(new String[]{"man", "moon", "good", "night"})).isEqualTo(Map.of("g", "d", "m", "n", "n", "t"));
    }
}
