class rotatebyk{
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
        if (head == null || k == 0)
            return head;

        Node curr = head;
        int count = 1;
        while (count < k && curr != null) {
            curr = curr.next;
            count++;
        }
        if (curr == null)
    return head;

Node newHead = curr.next;

Node temp = newHead;
while (temp.next != null) {
    temp = temp.next;
}

temp.next = head;  
curr.next = null;  

return newHead;
    }
}
}