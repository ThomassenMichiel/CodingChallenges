package codingbat.warmup2;

import org.openjdk.jmh.annotations.*;

@State(Scope.Benchmark)
public class CountXX {

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void theirs() {
        countXX2("abcxx");
        countXX2("xxx");
        countXX2("xxxx");
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    public void mine() {
        countXX("abcxx");
        countXX("xxx");
        countXX("xxxx");
    }

    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count++;
            }
        }
        return count;
    }

    public int countXX2(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }
}
