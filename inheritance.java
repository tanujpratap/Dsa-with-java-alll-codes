class cat{
    String x;
    public void setx(String x){
        this.x=x;
    }
    public String getx(){
        return x;

    }
}
    class dog extends cat{
        String y;
        public void sety(String y){
            this.y=y;
        }
        public String gety(){
            return y;
        }
        

    }

public class inheritance {
    public static void main(String[] args) {
        cat a=new cat();
        a.sety("hii");
        System.out.println(a.gety());
       
       
       
       
       
       
       
       
       
        
    }
    
}
