package codingbat.string3;

public class CountYZ {
    public int countYZ(String str) {
        return (int) java.util.Arrays.stream(str.split("[^a-zA-Z]"))
                .filter(s -> s.matches(".*[yzYZ]"))
                .count();
    }
}
