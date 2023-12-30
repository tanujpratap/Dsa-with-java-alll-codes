import java.util.*;
public class switch3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int operator=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(operator){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            if(b==0){
                System.out.println("sorry");
            }
                else{
                    System.out.println(a/b);

                }
                break;
                case 5:
                if(b==0){
                    System.out.println("sorry value doesn't exist");

                }
            else{
                System.out.println(a%b);
            }
            break;
            default:
            System.out.println("no operator found");
        }
        
    }
    
}
