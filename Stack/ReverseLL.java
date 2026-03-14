class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class StackLL {

    Node top = null;

    void push(Node x){
        x.next = top;
        top = x;
    }

    Node pop(){
        if(top == null){
            return null;
        }

        Node temp = top;
        top = top.next;
        temp.next = null;
        return temp;
    }

    boolean isEmpty(){
        return top == null;
    }
}

public class ReverseLL {

    static Node reverse(Node head){

        StackLL stack = new StackLL();
        Node temp = head;

        // push nodes into stack
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        head = stack.pop();
        temp = head;

        // rebuild list
        while(!stack.isEmpty()){
            temp.next = stack.pop();
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original:");
        print(head);

        head = reverse(head);

        System.out.println("Reversed:");
        print(head);
    }
}