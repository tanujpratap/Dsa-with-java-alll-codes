class cellphone{
    public void ringing(){
        System.out.println("ringing");
    }
    public void vibrating(){
        System.out.println("vbibrating");
    }
}
public class oopscellphone {
    public static void main(String[] args) {
        cellphone nokia=new cellphone();
        nokia.ringing();
        nokia.vibrating();
    
        
    }
    
}
