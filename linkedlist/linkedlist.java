class linkedlist {
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlists {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
    
    //     int temp=n3.data;
    //    n3.data=n4.data;
    //      n4.data=temp;


        Node temp=n3.next;
        n3.next=n4.next;
        n4.next=temp;



        Node head=n1;
        Node current=head;
        while(current!=null){
            System.out.print(current.data + " -> ");
            current=current.next;
        }   
        System.out.println("null");
        
    }
}
}
