package codewars.kyu6.funwithlists.reduce;

import codewars.kyu7.funwithlists.Node;

import java.util.function.BiFunction;

/**
 * url: https://www.codewars.com/kata/58319f37aeb69a89a00000c7/solutions/java
 */
class Solution {
    static <T> T reduce(Node<T> head, BiFunction<T, T, T> f, T init) {
        if (head == null) {
            return init;
        }
        T result = init;
        while (head != null) {
            result = f.apply(result, (T) head.data);
            head = head.next;
        }
        return result;
    }
}
