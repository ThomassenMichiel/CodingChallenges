package codingbat.ap1;


public class MergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        return java.util.stream.Stream.concat(java.util.Arrays.stream(a), java.util.Arrays.stream(b))
                .distinct()
                .sorted()
                .limit(n)
                .toArray(String[]::new);
    }
}
