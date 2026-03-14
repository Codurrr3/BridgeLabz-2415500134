class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack {

    Node head;

    boolean isEmpty(){
        return head == null;
    }

    // PUSH
    void push(int x){

        Node newNode = new Node(x);

        newNode.next = head;
        head = newNode;

        System.out.println(x + " pushed");
    }

    // POP
    int pop(){

        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = head.data;
        head = head.next;

        return value;
    }

    // PEEK
    int peek(){

        if(isEmpty()){
            System.out.println("Stack Empty");
            return -1;
        }

        return head.data;
    }

    // DISPLAY
    void display(){

        if(isEmpty()){
            System.out.println("Stack Empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class Operations {

    public static void main(String[] args){

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        stack.display();
    }
}