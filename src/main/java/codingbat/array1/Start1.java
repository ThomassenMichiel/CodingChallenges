package codingbat.array1;

import codingbat.ArrayHelper;

import static codingbat.ArrayHelper.array;

public class Start1 {
    public static void main(String[] args) {
        System.out.println(start1(array(1,2,3), array(1,3)));
        System.out.println(start1(array(7,2,3), array(1)));
        System.out.println(start1(array(1,2), array()));
    }

    public static int start1(int[] a, int[] b) {
        int arraysStartingWith1 = 0;
        if (a.length > 0 && a[0] == 1) {
            arraysStartingWith1++;
        }
        if (b.length > 0 && b[0] == 1) {
            arraysStartingWith1++;
        }
        return arraysStartingWith1;
    }
}
