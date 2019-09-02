package codewars.kyu8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class sorter {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String::compareToIgnoreCase);
        return textbooks;
    }
}