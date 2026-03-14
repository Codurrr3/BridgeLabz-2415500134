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

    void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if(top == null){
            return -1;
        }

        int val = top.data;
        top = top.next;
        return val;
    }

    int peek(){
        if(top == null){
            return -1;
        }

        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }
}

public class preSmallest {

    static void prevSmallest(Node head){

        StackLL stack = new StackLL();
        Node temp = head;

        while(temp != null){

            while(!stack.isEmpty() && stack.peek() >= temp.data){
                stack.pop();
            }

            if(stack.isEmpty()){
                System.out.print("-1 ");
            }
            else{
                System.out.print(stack.peek() + " ");
            }

            stack.push(temp.data);

            temp = temp.next;
        }
    }

    public static void main(String[] args){

        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(8);

        prevSmallest(head);
    }
}