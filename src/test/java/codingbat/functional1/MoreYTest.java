package codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MoreYTest {
    @Test
    void first() {
        assertThat(new MoreY().moreY(new ArrayList<>(List.of("a", "b", "c")))).isEqualTo(List.of("yay", "yby", "ycy"));
    }

    @Test
    void second() {
        assertThat(new MoreY().moreY(new ArrayList<>(List.of("hello", "there")))).isEqualTo(List.of("yhelloy", "ytherey"));
    }

    @Test
    void third() {
        assertThat(new MoreY().moreY(new ArrayList<>(List.of("yay")))).isEqualTo(List.of("yyayy"));
    }
}
