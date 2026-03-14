public class recursiveReverse {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void recursiveReverse(Node current) {
        if (current == null || current.next == null) {
            head = current;
            return;
        }

        recursiveReverse(current.next);
        current.next.next = current;
        current.next = null;
    }
}
