package codewars.kyu7.funwithlists.countif;

import codewars.kyu7.funwithlists.Node;

import java.util.function.Predicate;

class Solution {
    static <T> int countIf(Node<T> head, Predicate<T> p) {
        int count = 0;
        while (head != null) {
            if (p.test((T) head.data)) {
                count++;
            }
            head = head.next;
        }
        return count;
    }
}
