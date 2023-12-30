import java.util.Scanner;
public class result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks percentage:");
        int math=sc.nextInt();
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        if((math>=33)&&(physics>=33)&&(chemistry>=33)){
            System.out.println("congrats");
        }
        else{
            System.out.println("sorry! you failed");
        }
        
    }
    
}
