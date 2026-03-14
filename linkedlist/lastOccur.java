class lastOccur {

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class lastOccurs {

    Node head;

    void deleteLastOccurrence(int key) {
        if (head == null)
            return;

        Node temp = head;
        Node prev = null;
        Node lastOccur = null;
        Node lastOccurPrev = null;

        while (temp != null) {
            if (temp.data == key) {
                lastOccurPrev = prev;
                lastOccur = temp;
            }
            prev = temp;
            temp = temp.next;
        }

        if (lastOccur == null)
            return;

        if (lastOccurPrev == null) {
            head = head.next; 
        } else {
            lastOccurPrev.next = lastOccur.next; 
        }
    }
}

}