package codingbat.functional2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NoZTest {
    @Test
    void first() {
        assertThat(new NoZ().noZ(new ArrayList<>(List.of("aaa", "bbb", "aza")))).isEqualTo(List.of("aaa", "bbb"));
    }

    @Test
    void second() {
        assertThat(new NoZ().noZ(new ArrayList<>(List.of("hziz", "hzello", "hi")))).isEqualTo(List.of("hi"));
    }

    @Test
    void third() {
        assertThat(new NoZ().noZ(new ArrayList<>(List.of("hello", "howz", "are", "youz")))).isEqualTo(List.of("hello", "are"));
    }
}
