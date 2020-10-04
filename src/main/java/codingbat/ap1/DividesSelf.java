package codingbat.ap1;

public class DividesSelf {
    public boolean dividesSelf(int n) {
        return java.util.Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .allMatch(i -> {
                    if (i == 0) {
                        return false;
                    }
                    return n % i == 0;
                });
    }
}
