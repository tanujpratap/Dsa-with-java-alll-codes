import java.io.File;
public class filehandeling{
    public static void main(String[] args) {
        File myobj=new File("file.txt");
        System.out.println(myobj.canRead());
        System.out.println(myobj.canWrite());
        myobj.delete();
        System.out.println(myobj.exists());
        
    }
}