import java.util.Scanner;
public class incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        if(amount<250000){
            System.out.println("there is no tax");
        }
        else if((amount>=250000)&&(amount<=500000)){
            System.out.println((amount*5)/100);
        }
        else if((amount>500000)&&(amount<=1000000)){
            System.out.println((amount*20)/100);

        }
        else if(amount>1000000){
            System.out.println((amount*30)/100);
        }
        
        else{
            System.out.println("there is high tax in this amount");
        }
    }
    
}
