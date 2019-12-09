package codingbat.string3;

public class SumDigits {
    public int sumDigits(String str) {
        return java.util.Arrays.stream(str.replaceAll("[^0-9]", "").split(""))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
