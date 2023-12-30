public class divisionsum {
    public static void main(String[] args) {
        int sum=0;
        int n=6;
    for(int i=1;i<=1000;i++){
        if(n%i==0){
            sum=sum+i;
        }
    }
    System.out.println(sum);
    }
    
}
