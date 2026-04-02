class Node{
    int data;

    Node next;
    Node prev;


    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;

    }


}

class deq{

    Node front;
    Node rear;


    void insertAtFront(int val){

        Node newnode = new Node(val);

        if(front==null){
            front = newnode;
            rear = newnode;
            return;

        }

        newnode.next = front;
        front.prev = newnode;

        front = newnode;

        return;

    }



    void insertAtRear(int val){
        Node newnode = new Node(val);

        if(rear==null){
            front=newnode;
            rear=newnode;
            return;
        }
        
        newnode.prev=rear;
        rear.next=newnode;
        rear = newnode;

        return;

    }




    void deleteAtFront(){
        if(front==null){
            System.out.print("Queue is empty");
            return;
        }

        front=front.next;

        if(front!=null){
            front.prev=null;
        }
        else{
            rear=null;
        }


    }

    void deleteAtRear(){
        if(front==null){
            System.out.print("Queue is empty");
            return;
        }

        rear=rear.prev;
        if(rear!=null){
            rear.next=null;
        }
        else{
            front=null;
        }


    }


    void display(){

        if(front==null){
            System.out.print("Queue is empty");
            return;
        }

        Node temp = front;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }


    public static void main(String[] args){
        deq dq = new deq();

        dq.insertAtFront(30);
        dq.insertAtFront(20);
        dq.insertAtFront(10);
        dq.insertAtRear(40);
        dq.deleteAtFront();
        dq.deleteAtRear();
        dq.deleteAtRear();
       // dq.deleteAtRear();
        dq.display();
    }
    

    



    
}
