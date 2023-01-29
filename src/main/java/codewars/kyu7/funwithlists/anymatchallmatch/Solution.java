package codewars.kyu7.funwithlists.anymatchallmatch;

import codewars.kyu7.funwithlists.Node;

import java.util.function.Predicate;

class Solution {
    static <T> boolean anyMatch(Node<T> head, Predicate<T> p) {
        while (head != null) {
            if (p.test((T) head.data)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
    
    static <T> boolean allMatch(Node<T> head, Predicate<T> p) {
        while (head != null) {
            if (!p.test((T) head.data)) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
