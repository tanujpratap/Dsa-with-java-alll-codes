@FunctionalInterface
interface phone{
    void ring(int a);
}
public class lambdaexp {
    public static void main(String[] args) {
        phone obj=(a)->{System.out.println("hello"+a);
    

        };
        obj.ring(9);
        
        
    }
    
}
