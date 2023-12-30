import java.util.Scanner;
public class kmtomiles {
    public static void main(String[]args){
        System.out.println("enter the distance in km:");
        Scanner sc=new Scanner(System.in);
        float km=sc.nextFloat();
        float miles=(float)(0.621*km);
        System.out.println(miles+"miles");

    }
    
}
