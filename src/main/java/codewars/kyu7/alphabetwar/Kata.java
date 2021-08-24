package codewars.kyu7.alphabetwar;

/**
 * url: https://www.codewars.com/kata/59377c53e66267c8f6000027
 */
public class Kata {
    public static String alphabetWar(String fight) {
        int result = 0;
        for (int i = 0; i < fight.toCharArray().length; i++) {
            switch (fight.charAt(i)) {
                case 'w':
                    result -= 4;
                    break;
                case 'p':
                    result -= 3;
                    break;
                case 'b':
                    result -= 2;
                    break;
                case 's':
                    result -= 1;
                    break;
                case 'm':
                    result += 4;
                    break;
                case 'q':
                    result += 3;
                    break;
                case 'd':
                    result += 2;
                    break;
                case 'z':
                    result += 1;
                    break;
                default: break;
            }
        }
        String winner = result > 0 ? "Right" : "Left";
        return result == 0 ? "Let's fight again!" : winner + " side wins!";
    }
}
