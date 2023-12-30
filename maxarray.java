public class maxarray {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int[]arr={1,-2,3,300,5};
        for(int element:arr){
            if(element<min){
            min=element;
            }
        }
            System.out.println(min);

        
    }
    
}
