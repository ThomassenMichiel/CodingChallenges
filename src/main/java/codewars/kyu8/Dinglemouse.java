package codewars.kyu8;

public class Dinglemouse {
    
    public static void main(String[] args) {
        System.out.println(Dinglemouse.INST.plus100(23));
    }
    
    public static final Dinglemouse INST = new Dinglemouse();
    
    private final static int ONE_HUNDRED = 100;
    
    private final int value;
    
    private Dinglemouse() {
        value = ONE_HUNDRED;
    }
    
    public int plus100(int n) {
        return value + n;
    }
    
}