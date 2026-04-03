package queue;



// Circular Queue using singly linked list

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }


}




public class circularQueue {

    Node front;
    Node rear;

    void enqueue(int value){

        Node newnode= new Node(value);

        if(front==null){
            front=rear=newnode;
            rear.next=front;
        }
        else{
            rear.next=newnode;
            rear=newnode;
            rear.next=front;
        }



    }


    void dequeue(){

        if(front==null){
            System.out.println("Queue is empty");

        }

        else if(front==rear){
            front=rear=null;
        }
        else{
            
            front=front.next;
            rear.next=front;


        }
        
    }



    void display(){
        if(front==null){
            System.out.println("Queue is empty.");

        }

        else if(front==rear){
            System.out.println(front.data);

        }

        else{
            Node current = front.next;
            System.out.print(front.data + " ");

            while(current!=front){
                System.out.print(current.data + " ");
                current = current.next;

            }


        }
    }
    
    
    
    public static void main(String[] args){

        circularQueue cq = new circularQueue();

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.display();

        System.out.println();

        cq.enqueue(60);
        cq.enqueue(50);
        cq.display();


        System.out.println();

        cq.dequeue();
        cq.dequeue();

        cq.display();
       

        






    }



}
