package codingbat.logic1;

public class WithoutDoubles {
    public static void main(String[] args) {
        System.out.println(withoutDoubles(2,3,true));
        System.out.println(withoutDoubles(3,3,true));
        System.out.println(withoutDoubles(3,3,false));
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die1 = die1 == 6 ? 1 : die1 + 1;
        }
        return die1 + die2;
    }
}
