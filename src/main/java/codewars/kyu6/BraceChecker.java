package codewars.kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BraceChecker {

    public boolean isValid(String braces) {

        List<Character> openingBraces = Arrays.asList('(', '{', '[');
        List<Character> closingBraces = Arrays.asList(')', '}', ']');

        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < braces.toCharArray().length; i++) {
            char c = braces.charAt(i);
            if (openingBraces.contains(c)) {
                characters.push(c);
            }

            if (closingBraces.contains(c)) {
                if (characters.isEmpty()) {
                    return false;
                }

                char last = characters.peek();
                if (c == '}' && last == '{' || c == ')' && last == '(' || c == ']' && last == '[') {
                    characters.pop();
                } else {
                    return false;
                }
            }
        }

        return characters.isEmpty();
    }

}