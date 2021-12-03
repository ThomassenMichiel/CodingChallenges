package codewars.kyu7.isthisatriangle;

class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        double semiPerimeter = (a + b + c) / 2d;
        return 0 < Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c) );
    }
}
