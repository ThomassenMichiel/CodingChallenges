package codingbat.map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MapBullyTest {
    @Test
    void first() {
        assertThat(new MapBully().mapBully(new HashMap<>(Map.of("a", "candy", "b", "dirt")))).isEqualTo(Map.of("a", "", "b", "candy"));
    }

    @Test
    void second() {
        assertThat(new MapBully().mapBully(new HashMap<>(Map.of("a", "candy")))).isEqualTo(Map.of("a", "", "b", "candy"));
    }

    @Test
    void third() {
        assertThat(new MapBully().mapBully(new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh")))).isEqualTo(Map.of("a", "", "b", "candy", "c", "meh"));
    }
}
