package codingbat.string3;

public class MaxBlock {
    public int maxBlock(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int tempCount = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) != c) {
                    break;
                }
                tempCount++;
            }
            count = Math.max(count,tempCount);
        }
        return count;
    }
}
