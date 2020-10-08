package codingbat.map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class Topping3Test {
    @Test
    void first() {
        assertThat(new Topping3().topping3(new HashMap<>(Map.of("potato", "ketchup")))).isEqualTo(Map.of("potato", "ketchup", "fries", "ketchup"));
    }

    @Test
    void second() {
        assertThat(new Topping3().topping3(new HashMap<>(Map.of("potato", "butter")))).isEqualTo(Map.of("potato", "butter", "fries", "butter"));
    }

    @Test
    void third() {
        assertThat(new Topping3().topping3(new HashMap<>(Map.of("salad", "oil", "potato", "ketchup")))).isEqualTo(Map.of("spinach", "oil", "salad", "oil", "potato", "ketchup", "fries", "ketchup"));
    }
}
