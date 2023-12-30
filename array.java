//import java.util.Arrays;
//import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int[]arr={1,1,3,3,7,6,6,7};
      // arr[0]=30;
      // arr[1]=89;
      // arr[2]=56;
      // arr[3]=57;
      // arr[4]=58;
      // arr[5]=59;
       // arr[0]=40;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]&&i!=j){
                System.out.println(arr[j]);
           
            }
        }
            

        }
        
     // String []arr=new String[4];
      //System.out.println(arr[0]);
     // Scanner sc=new Scanner(System.in);
  // int []arr;
  // arr=new int[5];
  // 
  // for(int i=0;i<arr.length;i++){
     //   arr[i]=sc.nextInt();

    //  }
      /*for(int i=0;i<arr.length;i++){
        System.out.println("the array is:");
        System.out.println(arr[i]);

      }*/
     /* for(int num:arr){
        System.out.println(num+" ");
      }*/
     // System.out.println(Arrays.toString(arr));


      
        
    }
    
}
