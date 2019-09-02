package codewars.kyu4;

class DoubleLinear {
    public static void main(String[] args) {
        System.out.println(dblLinear(10));
    }
    
    public static int dblLinear (int n) {
        int result = 0;
        int first = 1;
        int second = first * 2 + 1;
        for (int i = 0; i < n; i++) {
            int temp = first;
            first = second;
            second += temp;
        }
        return second;
    }
}