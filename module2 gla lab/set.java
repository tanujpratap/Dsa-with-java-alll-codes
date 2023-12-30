import java.util.*;
public class set {
    public static void main(String[] args) {
     HashSet<String> s=new HashSet<String>();
     s.add("Ravi");
     s.add("vijay");
     s.add("Ravish");
     s.add("aman");
     System.out.println(s);
     Iterator <String> itr=s. iterator();
     while(itr.hasNext()){
     System.out.println(itr.next());

    }
}

}
