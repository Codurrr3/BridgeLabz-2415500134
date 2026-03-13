package Stack;
// Stack implementation using array
class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add an element to the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + x);
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed: " + x);
    }

    // Remove the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        shrink(); // Check if we can shrink the stack after popping
        return arr[top--];
    }

    // Return the top element without removing it
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }

    // resize the stack to double its current capacity
    public void resize() {
        int newCapacity = capacity * 2;
        int[] newArr = new int[newCapacity];
        System.arraycopy(arr, 0, newArr, 0, capacity);
        arr = newArr;
        capacity = newCapacity;
        System.out.println("Stack resized to capacity: " + capacity);
    }

    // if stack isnt used till its full capacity, we can shrink it to save memory
    public void shrink() {
        if (capacity > 1 && top < capacity / 4) {
            int newCapacity = capacity / 2;
            int[] newArr = new int[newCapacity];
            System.arraycopy(arr, 0, newArr, 0, top + 1);
            arr = newArr;
            capacity = newCapacity;
            System.out.println("Stack shrunk to capacity: " + capacity);
        }
    }


    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }


    public int size() {
        return top + 1;
    }


    public static void main(String[] args) {
        Stack stack = new Stack(60);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);  

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());

        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element is: " + stack.peek());

        stack.resize(); // Resize the stack to double its capacity
        stack.push(4);
        System.out.println("Top element after resizing is: " + stack.peek());
    }















}