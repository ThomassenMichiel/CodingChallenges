package codingbat.recursion;

public class Count8 {
    public static void main(String[] args) {
        System.out.println(new Count8().count8(818));
        System.out.println(new Count8().count8(8188));
        System.out.println(new Count8().count8(8818));
    }
    
    public int count8(int n) {
        if (n == 88) {
            return 4;
        } else if (n == 8) {
            return 1;
        } else if (n < 10) {
            return 0;
        }
        return count8(n);
    }
}
