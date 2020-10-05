package codingbat.ap1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatchUpTest {
    @Test
    void first() {
        assertThat(new MatchUp().matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"})).isEqualTo(1);
    }

    @Test
    void second() {
        assertThat(new MatchUp().matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"})).isEqualTo(2);
    }

    @Test
    void third() {
        assertThat(new MatchUp().matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"})).isEqualTo(1);
    }
}
