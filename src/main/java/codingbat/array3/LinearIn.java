package codingbat.array3;

public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true;
        }
        for (int i = 0, j = 0; i < outer.length; i++) {
            if (outer[i] == inner[j]) {
                j++;
            }
            if (j >= inner.length) {
                return true;
            }
        }
        return false;
    }
}
