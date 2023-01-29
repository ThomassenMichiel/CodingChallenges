package codewars.kyu6.funwithlists.filter;

import codewars.kyu7.funwithlists.Node;

import java.util.function.Predicate;

/**
 * url: https://www.codewars.com/kata/582041237df353e01d000084
 */
public class Solution {
    public static <T> Node<T> filter(Node<T> head, Predicate<T> p) {
        if (head == null) {
            return null;
        }
        if (head.data == null) {
            return new Node(null);
        }
        Node<T> currentNode = null;
        Node<T> result = null;
        Node<T> previous = null;
        do {
            if (p.test((T) head.data)) {
                if (currentNode == null) {
                    currentNode = new Node<>(null);
                    result = currentNode;
                    previous = currentNode;
                }
                currentNode.data = head.data;
                currentNode.next = new Node<>(null);
                previous = currentNode;
                currentNode = currentNode.next;
            }
            head = head.next;
        } while (head != null);
        previous.next = null;
        return result;
    }
}
