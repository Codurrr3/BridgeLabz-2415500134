public class QueueImplementationUsingList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node front, rear;

    public QueueImplementationUsingList() {
        front = rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueueImplementationUsingList queue = new QueueImplementationUsingList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.printQueue();

        System.out.println("Front: " + queue.peek());
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}