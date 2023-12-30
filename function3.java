/*public class function3 {
    public static void main(String[] args) {
        pattern(5);
        pattern(10);
        
    }
    static void pattern(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}*/

public class function3 {
    public static void main(String[] args) {
        pattern(5);
        pattern(10);
        
    }
    static void pattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}

