package codingbat.array1;

import codingbat.ArrayHelper;

import java.util.Arrays;

import static codingbat.ArrayHelper.array;

public class PlusTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusTwo(array(1, 2), array(3, 4))));
        System.out.println(Arrays.toString(plusTwo(array(4, 4), array(2, 2))));
        System.out.println(Arrays.toString(plusTwo(array(9, 2), array(3, 4))));
    }

    private static int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0],a[1],b[0],b[1]};
    }
}
