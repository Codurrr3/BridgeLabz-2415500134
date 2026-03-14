class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedListRotate {

    Node rotateLeft(Node head, int k) {
        if (head == null || k == 0) return head;

        Node curr = head;
        int count = 1;

        while (count < k && curr != null) {
            curr = curr.next;
            count++;
        }

        if (curr == null) return head;

        Node newHead = curr.next;
        Node temp = newHead;

        while (temp.next != null)
            temp = temp.next;

        temp.next = head;
        curr.next = null;

        return newHead;
    }
}

public class RotateTest {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        LinkedListRotate obj = new LinkedListRotate();
        head = obj.rotateLeft(head, 2);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
