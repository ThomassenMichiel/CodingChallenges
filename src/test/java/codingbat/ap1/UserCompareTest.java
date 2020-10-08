package codingbat.ap1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserCompareTest {
    @Test
    void first() {
        assertThat(new UserCompare().userCompare("bb", 1, "zz", 2)).isEqualTo(-1);
    }


    @Test
    void second() {
        assertThat(new UserCompare().userCompare("bb", 1, "aa", 1)).isEqualTo(1);
    }

    @Test
    void third() {
        assertThat(new UserCompare().userCompare("bb", 1, "bb", 1)).isEqualTo(0);
    }
}
