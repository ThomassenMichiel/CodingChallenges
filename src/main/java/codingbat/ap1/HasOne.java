package codingbat.ap1;


public class HasOne {
    public boolean hasOne(int n) {
        return java.util.Arrays.stream(String.valueOf(n).split(""))
                .anyMatch(s -> Integer.parseInt(s) == 1);
    }
}
