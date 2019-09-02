package codewars.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RepeatStr {
    public static String repeatStr(final int repeat, final String string) {
        return IntStream.range(0,repeat)
                .mapToObj(StringBuilder::new)
                .map(stringBuilder -> stringBuilder.append(string))
                .map(StringBuilder::toString)
                .collect(Collectors.joining());
    }
}
