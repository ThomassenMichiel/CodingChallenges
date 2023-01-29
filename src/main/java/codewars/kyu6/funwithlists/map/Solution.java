package codewars.kyu6.funwithlists.map;

import codewars.kyu7.funwithlists.Node;

import java.util.function.Function;

/**
 * url: https://www.codewars.com/kata/58259d9062cfb45e1a00006b/
 */
class Solution {
    static <T, R> Node<R> map(Node<T> head, Function<T, R> f) {
        if (head == null || head.data == null) {
            return null;
        }
        Node<R> currentNode = new Node(null);
        Node<R> result = currentNode;
        Node<R> previous = null;
        while (head != null) {
            currentNode.data = f.apply((T) head.data);
            currentNode.next = new Node<>(null);
            previous = currentNode;
            currentNode = currentNode.next;
            head = head.next;
        }
        previous.next = null;
        return result;
    }
}
