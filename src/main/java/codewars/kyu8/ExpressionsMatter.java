package codewars.kyu8;

public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c) {
        int previousBiggest = 0;
        for (int i = 0; i < 9; i++) {
            switch (i) {
                case 0: previousBiggest = Math.max(previousBiggest, (a + b + c)); break;
                case 1: previousBiggest = Math.max(previousBiggest, (a + b * c)); break;
                case 2: previousBiggest = Math.max(previousBiggest, ((a + b) * c)); break;
                case 3: previousBiggest = Math.max(previousBiggest, (a * b + c)); break;
                case 4: previousBiggest = Math.max(previousBiggest, (a * (b + c))); break;
                case 5: previousBiggest = Math.max(previousBiggest, (a * b * c)); break;
            }
        }
        return previousBiggest;
    }
}
