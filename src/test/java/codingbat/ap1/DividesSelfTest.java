package codingbat.ap1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DividesSelfTest {
    @Test
    void first() {
        assertThat(new DividesSelf().dividesSelf(128)).isTrue();
    }

    @Test
    void second() {
        assertThat(new DividesSelf().dividesSelf(12)).isTrue();
    }

    @Test
    void third() {
        assertThat(new DividesSelf().dividesSelf(120)).isFalse();
    }

    @Test
    void fourth() {
        assertThat(new DividesSelf().dividesSelf(32)).isFalse();
    }
}
