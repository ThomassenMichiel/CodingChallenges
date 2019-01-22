package codewars.kyu6;

import java.util.Arrays;

public class EnoughIsEnough {
    public static void main(String[] args) {
        int[] ints = deleteNth(new int[]{1, 1, 1, 1, 2, 2, 3, 3, 3, 3}, 3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        for (int i = 0; i < elements.length; i++) {
            int count = 0;
            for (int j = i; j < elements.length; j++) {
                if (elements[i] == elements[j] && count >= maxOccurrences) {
                    elements[j] = -1;
                    count++;
                } else if (elements[i] == elements[j]) {
                    count++;
                }
            }
        }
        return Arrays.stream(elements).filter(value -> value != -1).toArray();
    }

}