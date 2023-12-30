public class perc {
    public static void main(String[] args) {
        int[]marks={50,70,89,65,54};
        float sum=0;
        for(int element:marks){
            sum=sum+element;
        }
        System.out.println(sum/marks.length);
    }
    
}
