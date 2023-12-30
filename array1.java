public class array1 {
    public static void main(String[] args) {
        int[]rollnumber=new int[5];
        rollnumber[0]=55;
        rollnumber[1]=56;
        rollnumber[2]=57;
        rollnumber[3]=58;
        rollnumber[4]=59;
        //System.out.println(rollnumber[4]);
       // System.out.println(rollnumber.length);
      // for(int i=0;i<5;i++){
    //     System.out.println(rollnumber[i]);
    //   }
       //for(int i=rollnumber.length-1;i>=0;i--){
    //       System.out.println(rollnumber[i]);
      // }
      for(int element:rollnumber){
          System.out.println(element);
      }
    }
    
}
