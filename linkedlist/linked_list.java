//import java.util.LinkedList;

public class linked_list{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //method
    public void addFirst(int  data){
          //step 1>>create a new node
        Node newnode=new Node(data);
        size++;
        if(head==null){
        head=tail=newnode;
        return ;
        }
        //step 1>>create a new node
     //   Node newnode=new Node(data);
        //step 2>>new node next =head
        newnode.next=head;//link
        //step 3>>
        head=newnode;
size++;
    }
      public  void addLast(int data){

        Node newnode=new Node(data);
        size++;
        if(head==null){//when head is null then we can say linked list is empty
            head=tail= newnode;
            return;
        }
        tail.next= newnode;
        tail=newnode;
       
      }
      public void print(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->>");
temp=temp.next;
        }
        System.out.println("null");

      }
      public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;  
        }
       
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1;temp->prev
        newnode.next=temp.next;
        temp.next=newnode;
      }
      public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val =head.data;
            head=tail=null;
            size=0;
            return val;

        }
        int val=head.data;
        head=head.next;
        size--;  
        return val;
      }
      public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val =head.data;
            head=tail=null;
            size=0;
            return val;

        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
             prev=prev.next;
        }
       int val=prev.next.data;//tail data
prev.next=null;
tail=prev;
size--;
return val;
      }
      public int itrsearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
temp=temp.next;
i++;
        }
        //key not found case
        return -1;
      }
      public int helper(Node head, int key ){
if(head==null){
  return -1;
}
if(head.data==key){
  return 0;
}
int idx=helper(head.next,key);
if(idx==-1){
  return -1;
}
return idx+1;


}



      
      public int recsearch(int key){
return helper(head,key);
      }
    public void reverse(){
      Node prev=null;
      Node curr=tail=head;
      Node next;
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      head=prev;
    }
    public void deletenthfromend(int n){
      //calculate size
      int size=0;
      Node temp=head;
      while(temp!=null){
        temp=temp.next;
        size++;
      }
      if(n==size){
        head=head.next;
        return;
      }
//size-n
int i=1;
int itofind=size-n   ;
Node prev=head;
while(i<itofind){
  prev=prev.next;
  i++;
}
prev.next=prev.next.next;
return;
    }
//slow fast approach
    public Node findmid(Node head){
      Node slow =head;
      Node fast =head;
      while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

      }
      
return slow;//slow is my midnode

    }
    public boolean check_palindrome(){
      if(head==null||head.next==null){
        return true;
      }
      //step 1->find mid
      Node midnode=findmid(head);
      //step 2->reverse 2nd half
      Node prev=null;
      Node curr=midnode;
      Node next;
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

      }

Node right=prev;//right half head
Node left=head;
//step-3->>>check left half right half
while(right!=null){
  if(left.data!=right.data){
    return false;
  }
  left=left.next;
  right=right.next;

}
return true;
    }
    public static boolean iscycle(){//floyd's cycle finding algorithm
      Node slow=head;
      Node fast=head;
while(fast!=null&&fast.next!=null){
  slow=slow.next;
  fast=fast.next.next;
  if(slow==fast){
    return true;
  }
  
}
return false;

    }
    public static void removecycle(){
      //detect a cycle
      Node slow=head;
      Node fast =head;
      boolean cycle=false;
      while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next;
        if(slow==fast){
          cycle=true;
          break;
        }
      }  
      if(cycle==false){
        return;
      } 
      //find meeting point
      slow=head;
      Node prev=null;
      while(slow!=fast){
        prev=fast;
        slow=slow.next;
        fast=fast.next;
      }
      //remove cycle//last Node->>null
      prev.next=null;
    }
    private Node getmid(Node head){
      Node slow=head;
      Node fast=head.next;
      while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow; //mid
    }
    private Node merge(Node head1,Node head2){
      Node mergedll=new Node(-1);
      Node temp=mergedll;
      while(head1!=null&&head2!=null){
        if(head1.data<=head2.data){
          temp.next=head1;
          head1=head1.next;
          temp=temp.next;

        }
        else{
          temp.next=head2;
          head2=head2.next;
          temp=temp.next;
        }
      }
      while(head1!=null){
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;

      }
      while(head2!=null){
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
      }
      return mergedll.next;
    }
    public Node  mergesort(Node head){
      if(head==null ||head.next==null){
        return head;
      }
      //getmid->
      Node mid=getmid(head);
      //left and right ms
      Node righthead=mid.next;
      mid.next=null;
      Node newleft=mergesort(head);
      Node newright=mergesort(righthead);
      return merge(newleft,newright);

    }
    public void zigzag(){
      //find mid
      Node slow=head;
      Node fast=head.next;
      while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      Node mid= slow;
      //reverse 2nd half
      Node curr=mid.next;
      mid.next=null;
      Node prev=null;
      Node next;
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      Node left=head;
      Node right=prev;
      Node nextl,nextr;
      //alt merge  zigzag merge
      while(left!=null&&right!=null){
        nextl=left.next;
        left.next=right;
        nextr=right.next;
        right.next=nextl;
        left=nextl;
        right=nextr;
      }

    }
    public static void main(String[] args) {
  // LinkedList<Integer> ll=new LinkedList<> ();   
  linked_list ll=new linked_list();
      //  ll.print();
       // ll.addFirst(2);
      //  ll.print();
      //  ll.addFirst(1 );
      //  ll.print();
  // ll.addLast(4);
   // ll.print();
 //  ll.addLast(5);
  //  ll.print();
//ll.add(2,3);
 // ll.removeFirst();
 // ll.removeLast();
//System.out.println(ll);
//System.out.println(ll.size);
//System.out.println(ll.itrsearch(3));
//System.out.println(ll.itrsearch(10));
//System.out.println(ll.recsearch(3));
//System.out.println(ll.size);
       //ll.reverse();
       //ll.print();
      // ll.print();
      // ll.print();
// ll.addLast(1);
// ll.addLast(2);
// ll.addLast(2);
// ll.addLast(1);
//l.print();
//m.out.println(ll.check_palindrome());
//
   // head=new Node(1);

   // Node temp=new Node(2);
   // head.next=temp;
   // head.next.next=new Node(3);
   // head.next.next.next=temp;
   //// 1->2->3->1
   // System.out.println(iscycle());
   // removecycle();
   //System.out.println(iscycle());
   ll.addFirst(1);
   ll.addFirst(2);
   ll.addFirst(3);
   ll.addFirst(4);
   ll.addFirst(5);
   ll.print();
  // Node head=ll.mergesort(ll.head);
  ll.zigzag();
   ll.print();
    }
}