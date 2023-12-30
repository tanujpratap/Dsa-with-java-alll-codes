public class sorted {
    public static void main(String[] args) {
        int []arr={50,40,30,20,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("not sorted");
                break;
            }
            else{
                System.out.println("sorted");
                break;
            }

        }
    }
    
}
