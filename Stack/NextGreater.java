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

public class NextGreater {

    public static void nextGreater(int arr[]) {

        int n = arr.length;
        int result[] = new int[n];

        StackLL stack = new StackLL();

        for(int i = n-1; i >= 0; i--) {

            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                result[i] = -1;
            } 
            else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        for(int x : result){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {4,5,2,10,8};

        nextGreater(arr);
    }
}