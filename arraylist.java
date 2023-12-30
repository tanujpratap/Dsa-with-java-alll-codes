import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new <Integer>ArrayList();
       //list.add(1);
       //list.add(2);
       //list.add(13);
       //list.add(4);
       //list.add(5);
       //list.add(6);
       //System.out.println(list);
       //System.out.println(list.get(0));
       for(int i=0;i<10;i++){
        list.add(sc.nextInt());
       }
       for(int i=0;i<10;i++){
        System.out.println(list.get(i));
       }

    }
    
}
 