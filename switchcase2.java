import java.util.*;
public class switchcase2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Month=sc.nextLine();
        switch(Month){
            case "january":
                System.out.println("31 days");
                    break;
            case "february":
                System.out.println("28 days");
                    break;
            case "march":
                System.out.println("31 days");
                    break;
            case "april":
                System.out.println("30 days");
                    break;
            case "may":
                System.out.println("31 days");
                    break;
            case "june":
                System.out.println("30 days");
                    break;
            case "july":
                System.out.println("31 days");
                    break;
            case "august":
                System.out.println("31 days");
                    break;
            case "september":
                System.out.println("30 days");
                    break;
            case "october":
                System.out.println("31 days");
                    break;
            case "november":
                System.out.println("30 days");
                    break;
            case "december":
                System.out.println("31 days");
                    break;
            default:
                System.out.println("no month exist");    
                    


        }
        
    }
    
}
