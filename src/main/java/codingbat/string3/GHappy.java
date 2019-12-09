package codingbat.string3;

public class GHappy {
    public boolean gHappy(String str) {
        return !str.replaceAll("g{2,}","").contains("g");
    }
}
