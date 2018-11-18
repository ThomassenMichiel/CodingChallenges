package codingbat.warmup2;

public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }

    public static int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String substring = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(substring)) {
                count++;
            }
        }
        return count;
    }
}
