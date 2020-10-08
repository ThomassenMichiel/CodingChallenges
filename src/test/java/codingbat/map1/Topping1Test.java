package codingbat.map1;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class Topping1Test {
    @Test
    void first() {
        assertThat(new Topping1().topping1(new HashMap<>(Map.of("ice cream", "peanuts")))).isEqualTo(Map.of("bread", "butter", "ice cream", "cherry"));
    }

    @Test
    void second() {
        assertThat(new Topping1().topping1(new HashMap<>(Collections.emptyMap()))).isEqualTo(Map.of("bread", "butter"));
    }

    @Test
    void third() {
        assertThat(new Topping1().topping1(new HashMap<>(Map.of("pancake", "syrup")))).isEqualTo(Map.of("bread", "butter", "pancake", "syrup"));
    }
}
