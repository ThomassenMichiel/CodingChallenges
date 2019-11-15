package codewars.kyu8;

public class DingleMouseStaticElectrickery {
    
    public static void main(String[] args) {
        System.out.println(DingleMouseStaticElectrickery.INST.plus100(23));
    }
    
    public static final DingleMouseStaticElectrickery INST = new DingleMouseStaticElectrickery();
    
    private final static int ONE_HUNDRED = 100;
    
    private final int value;
    
    private DingleMouseStaticElectrickery() {
        value = ONE_HUNDRED;
    }
    
    public int plus100(int n) {
        return value + n;
    }
    
}
