package codewars.kyu5.smallfuck;

/**
 * url: https://www.codewars.com/kata/58678d29dbca9a68d80000d7
 */
public class Smallfuck {
    
    public static String interpreter(String code, String tape) {
        System.out.println(code);
        System.out.println(tape);
        int cell = 0;
        for (int i = 0; i < code.length(); i++) {
            switch (code.charAt(i)) {
                case '>':
                    cell++;
                    break;
                case '<':
                    cell--;
                    break;
                case '*':
                    tape = replaceBit(tape, cell);
                    break;
                case '[':
                    if (tape.charAt(cell) == '0') {
                        i = code.lastIndexOf(']', i);
                    }
                    break;
                case ']':
                    i = code.substring(0, i).lastIndexOf('[');
                    break;
            }
            if (cell < 0 || cell > tape.length() - 1) {
                break;
            }
        }
        return tape;
    }
    
    private static String replaceBit(String tape, int cell) {
        return tape.substring(0, cell) +
                (Character.getNumericValue(tape.charAt(cell)) ^ 1) +
                tape.substring(cell + 1);
    }
}
