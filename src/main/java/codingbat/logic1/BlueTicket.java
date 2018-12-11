package codingbat.logic1;

public class BlueTicket {
    public static void main(String[] args) {
        System.out.println(blueTicket(9,1,0));
        System.out.println(blueTicket(9,2,0));
        System.out.println(blueTicket(6,1,4));
    }

    public static int blueTicket(int a, int b, int c) {
        if (a + b == 10 || a + c == 10 || b + c == 10) {
            return 10;
        }

        if (a + b == 10 + b + c || a + b == 10 + a + c) {
            return 5;
        }

        return 0;
    }
}
