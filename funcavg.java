public class funcavg {
    public static void main(String[] args) {
    System.out.println(avg(1,2,3,4)/4f);
        
    }
    static int avg(int...arr){
        int result=0;
        for(int element:arr){
            result=result+element;
            

        }
        return result;

    }
    
}
