import java.util.Scanner;
import java.util.Arrays;
public class _2darrayyy {
    public static void main(String[] args) {
        int [][]arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
       // int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
       // System.out.println(arr[2]);
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();

        }
       }
      for(int i=0;i<arr.length;i++){
       for(int j=0;j<arr[i].length;j++){
       System.out.println(arr[i][j]);

       }
       System.out.println();
      }
     // for(int i=0;i<arr.length;i++){
    //System.out.println(Arrays.toString(arr[i]));
     // }
    }
    
}
