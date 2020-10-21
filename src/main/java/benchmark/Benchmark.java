package benchmark;

import codewars.kyu5.JomoPipi;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Warmup;

public class Benchmark {


    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 20)
    @org.openjdk.jmh.annotations.Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void first() {
        JomoPipi.jumbledString("Greetings", 8);
    }
}
