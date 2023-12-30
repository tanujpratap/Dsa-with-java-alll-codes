public class doublylinkedlist {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
        public void addfirst(int data){
Node newnode=new Node(data); 
size++;
if(head==null){
    head=tail=newnode;
return;
}
newnode.next=head;
head.prev=newnode;
head=newnode;
        }
        public void print(){
Node temp=head;
while(head!=null){
    System.out.print(temp.data+"<->");
temp=temp.next;

}
System.out.println("null");
        }
        //removefirst
        public int removefirst(){
            if(head==null){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }
            if(size==1){
               int val=head.data;
               head=tail=null;
               size--;
               return val;

            }
int val=head.data;
head=head.next;
head.prev=null;
size--;
return val;
        }
        public void reversedll(){
            Node curr=head;
            Node prev=null;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                curr.prev=next;
                prev=curr;
                curr=next;
            }
head=prev;
        }
    
    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args) {
        doublylinkedlist dll=new doublylinkedlist();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);

        dll.print();
        System.out.println(doublylinkedlist.size);
        dll.removefirst();
        dll.print();
        System.out.println(doublylinkedlist.s ize);
        dll.reversedll();
    }
    
}
  