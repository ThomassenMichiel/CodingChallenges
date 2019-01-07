package codingbat.array1;

import codingbat.ArrayHelper;

import java.util.Arrays;

import static codingbat.ArrayHelper.array;

public class Make2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(make2(array(4, 5), array(1, 2, 3))));
        System.out.println(Arrays.toString(make2(array(4), array(1, 2, 3))));
        System.out.println(Arrays.toString(make2(array(), array(1, 2))));
    }

    private static int[] make2(int[] a, int[] b) {
        if (a.length == 0) {
            return new int[]{b[0],b[1]};
        }
        if (a.length >= 2) {
            return new int[]{a[0],a[1]};
        }
        if (a.length == 1) {
            return new int[]{a[0],b[0]};
        }
        return new int[]{};
    }
}
