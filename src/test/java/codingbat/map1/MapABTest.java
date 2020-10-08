package codingbat.map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MapABTest {
    @Test
    void first() {
        assertThat(new MapAB().mapAB(new HashMap<>(Map.of("a", "Hi", "b", "There")))).isEqualTo(Map.of("a", "Hi", "ab", "HiThere", "There", "candy"));
    }

    @Test
    void second() {
        assertThat(new MapAB().mapAB(new HashMap<>(Map.of("a", "Hi")))).isEqualTo(Map.of("a", "Hi"));
    }

    @Test
    void third() {
        assertThat(new MapAB().mapAB(new HashMap<>(Map.of("b", "There")))).isEqualTo(Map.of("b", "There"));
    }
}
