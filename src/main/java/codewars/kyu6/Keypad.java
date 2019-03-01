package codewars.kyu6;

public class Keypad {
    public static void main(String[] args) {
        System.out.println(presses("WHERE DO U WANT 2 MEET L8R"));
    }
    public static int presses(String phrase) {
        String lowerCasePhrase = phrase.toLowerCase();
        int amountOfPresses = 0;
        for (char c : lowerCasePhrase.toCharArray()) {
            switch (c) {
                case ' ':
                case '1':
                case '*':
                case '#':
                case 'a':
                case 'd':
                case 'g':
                case 'j':
                case 'm':
                case 'p':
                case 't':
                case 'w': amountOfPresses++; break;
                case '0':
                case 'b':
                case 'e':
                case 'h':
                case 'k':
                case 'n':
                case 'q':
                case 'u':
                case 'x': amountOfPresses += 2; break;
                case 'c':
                case 'f':
                case 'i':
                case 'l':
                case 'o':
                case 'r':
                case 'v':
                case 'y': amountOfPresses += 3; break;
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '8':
                case 's':
                case 'z': amountOfPresses += 4; break;
                case '7':
                case '9': amountOfPresses += 5; break;
            }
        }
        return amountOfPresses;
    }
}
