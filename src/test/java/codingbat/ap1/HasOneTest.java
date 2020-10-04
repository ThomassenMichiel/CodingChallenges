package codingbat.ap1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HasOneTest {
    @Test
    void first() {
        assertThat(new HasOne().hasOne(10)).isTrue();
    }

    @Test
    void second() {
        assertThat(new HasOne().hasOne(22)).isFalse();
    }

    @Test
    void third() {
        assertThat(new HasOne().hasOne(220)).isFalse();
    }
}
