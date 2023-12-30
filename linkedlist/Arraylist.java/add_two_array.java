
import java.util.*;
public class add_two_array {
    public static void main(String []args){
ArrayList<Integer>al=new ArrayList<>();
int arr1[]={2,3,4,6};
int arr2[]={6,3,8,4,3,6};
int end1=arr1.length-1;
int end2=arr2.length-1;
while(end1>0 && end2>0){
   int totalsum=arr1[end1]+arr2[end2];
   int sum=totalsum%10;
   al.add(sum);
   int carry=totalsum/10;
   al.add(carry);
}
System.out.println(al);
    }
    
}
