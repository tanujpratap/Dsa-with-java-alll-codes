public class queue_implementation_using_linkedList {
    static class Node{
         int data;
        Node next;

    
    Node(int data){
        this.data=data;
        this.next=null;
    }}
    static class Queue{
        static Node head=null;
        static Node tail=null;
        public static boolean isempty(){
            return head==null&&tail==null;        }
    
    public static void adddata(int data){
        Node newnode=new Node( data);
        if(head==null){
            head=tail=newnode;
            return;
        }
    
            tail.next=newnode;
            tail=newnode;
    

    }
    public static int remove(){
        if(isempty()){
            System.out.println("queue is empty");
            return -1;
        }
        int front =head.data;
        //single  element
        if(tail==head){
            tail=head=null;

        }
        else{
            head=head.next;
        }
        return front;
    }
    public static int peek(){
        if(isempty()){
            System.out.println("queue is empty");
            return -1;
        }
        return head.data;
    }
}
    public static void main(String[] args) {
        Queue q=new Queue();
        q.adddata(1);
        q.adddata(2);
        q.adddata(3);
        while(!q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
