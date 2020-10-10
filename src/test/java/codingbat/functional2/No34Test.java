package codingbat.functional2;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No34Test {
    @Test
    void first() {
        assertThat(new No34().no34(new ArrayList<>(List.of("a", "bb", "ccc")))).isEqualTo(List.of("a", "bb"));
    }

    @Test
    void second() {
        assertThat(new No34().no34(new ArrayList<>(List.of("a", "bb", "ccc", "dddd")))).isEqualTo(List.of("a", "bb"));
    }

    @Test
    void third() {
        assertThat(new No34().no34(new ArrayList<>(List.of("ccc", "dddd", "apple")))).isEqualTo(List.of("apple"));
    }
}
