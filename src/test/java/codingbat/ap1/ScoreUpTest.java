package codingbat.ap1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScoreUpTest {
    @Test
    void first() {
        assertThat(new ScoreUp().scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "c"})).isEqualTo(6);
    }

    @Test
    void second() {
        assertThat(new ScoreUp().scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"})).isEqualTo(11);
    }

    @Test
    void third() {
        assertThat(new ScoreUp().scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "b"})).isEqualTo(16);
    }

    @Test
    void fourth() {
        assertThat(new ScoreUp().scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"?", "c", "?", "?"})).isEqualTo(-1);
    }
}
