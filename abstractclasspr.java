abstract class pen{
    abstract void refill();
    abstract void write();

}
 class fountainpen extends pen{
    public void refill(){
        System.out.println("refill...");
        
    }
    public void write(){
        System.out.println("writing...");
    }
    public void changenib(){
        System.out.println("change  nib");
    }
 }


public class abstractclasspr {
    public static void main(String[] args) {
        fountainpen fp=new fountainpen();
        fp.write();
        fp.refill();
        fp.changenib();
        
    }
    
}
