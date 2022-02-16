package codewars.kyu7.funwithlists;

public class Helpers {
    public static Node<?> listFromArray(Object... objects) {
        Node<?> currentNode = new Node<>(objects[0]);
        Node<?> firstNode = new Node<>(objects[0]);
        for (int i = 1; i < objects.length; i++) {
            Node<Object> newNode = new Node<>(objects[i]);
            currentNode.next = newNode;
            currentNode = newNode;
            if (i == 1) {
                firstNode.next = newNode;
            }
        }
        return firstNode;
    }
}
