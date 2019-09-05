package codewars.kyu8;

import java.util.List;

class Sorter {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String::compareToIgnoreCase);
        return textbooks;
    }
}
