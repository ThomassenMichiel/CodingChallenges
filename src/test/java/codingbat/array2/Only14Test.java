package codingbat.array2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Only14Test {

    @Test
    void first() {
        assertThat(new Only14().only14(new int[]{1, 4, 1, 4})).isTrue();
    }

    @Test
    void second() {
        assertThat(new Only14().only14(new int[]{1, 4, 2, 4})).isFalse();
    }

    @Test
    void third() {
        assertThat(new Only14().only14(new int[]{1, 1})).isTrue();
    }
}