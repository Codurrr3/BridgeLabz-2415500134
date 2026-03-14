class findmid{

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class findmids {

    Node head;

    public void findMiddle() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        int len = 0;
        Node temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int mid = len / 2;
        temp = head;

        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        System.out.println("Middle element is: " + temp.data);
    }
}
}