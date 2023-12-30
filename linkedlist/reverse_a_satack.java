import java.util.Scanner;
import java.util.Stack;
public class reverse_a_satack {
    public static void pushatbottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push( data);
            return;
        }
        int top =s.pop();
        pushatbottom(s, data);
        s.push(top);
    }
   
        public static void reversestack(Stack<Integer>s){
            if(s.isEmpty()){
                return;
            }
            int top=s.pop();
            reversestack(s);
            pushatbottom(s,top);
        }
        static void printstack(Stack<Integer>s){
            while(!s.isEmpty()){
                System.out.println(s.pop());
            }
        }
        public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //printstack(s);
        reversestack(s);
        printstack(s);
    }
    
}
