public class arrayex1 {
    public static void main(String[] args) {
        float[]arr={1.2f,4.8f,9.67f,50.0f,7.77f};
        float  num=1.3f;
      


        
       for(float element:arr){
        if(num==element){
            System.out.println("present");
        
        break;
        }
            else{
                System.out.println("not present");
                break;
            }

          
       }
    }
    
}
