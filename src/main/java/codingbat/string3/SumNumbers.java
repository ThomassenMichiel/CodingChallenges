package codingbat.string3;


public class SumNumbers {
    public int sumNumbers(String str) {
        return java.util.Arrays.stream(str.replaceAll("[^0-9]", " ")
                .replaceAll("\\s+", " ")
                .split(" "))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
