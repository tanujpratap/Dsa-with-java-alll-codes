import java.util.*;
public class percentage {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int english=sc.nextInt();
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        int math=sc.nextInt();
        int hindi=sc.nextInt();
        int maxscore=500;
        int totalscore=english+physics+chemistry+math+hindi;
        float perc=totalscore*100/maxscore;
        System.out.println(perc);





    }
}
