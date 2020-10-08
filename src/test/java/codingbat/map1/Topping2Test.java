package codingbat.map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class Topping2Test {
    @Test
    void first() {
        assertThat(new Topping2().topping2(new HashMap<>(Map.of("ice cream", "cherry")))).isEqualTo(Map.of("yogurt", "cherry", "ice cream", "cherry"));
    }

    @Test
    void second() {
        assertThat(new Topping2().topping2(new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry")))).isEqualTo(Map.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry"));
    }

    @Test
    void third() {
        assertThat(new Topping2().topping2(new HashMap<>(Map.of("yogurt", "salt")))).isEqualTo(Map.of("yogurt", "salt"));
    }
}
