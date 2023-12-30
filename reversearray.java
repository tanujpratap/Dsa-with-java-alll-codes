public class reversearray {
    public static void main(String[] args) {
        int temp=0;
        int[]arr={1,2,3,4};
        

        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        for(int element:arr){
        System.out.println(element);
        }
    }
    
}
