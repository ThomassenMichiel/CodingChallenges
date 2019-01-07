package codingbat.array1;

import codingbat.ArrayHelper;

import java.util.Arrays;

import static codingbat.ArrayHelper.array;

public class BiggerTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(biggerTwo(array(1, 2), array(3, 4))));
        System.out.println(Arrays.toString(biggerTwo(array(3, 4), array(1, 2))));
        System.out.println(Arrays.toString(biggerTwo(array(1, 1), array(1, 2))));
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        return a[0] + a[1] >= b[0] + b[1] ? a : b;
    }
}
