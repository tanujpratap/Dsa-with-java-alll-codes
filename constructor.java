

class cylinder{
    private int radius;
    private int height;
    public void setheight(int height){
         this.height=height;
    }
    public int getheight(){
    return height;
    }
    public int getradius(){
        return radius;
    }
    public void setradius(int radius){
        this.radius=radius;
    }
    public cylinder(){
         height=12;
         radius =13;
    }
}
public class constructor {
    public static void main(String[] args) {
        cylinder myCylinder=new cylinder();
        //myCylinder.setheight(123);
        System.out.println(myCylinder.getheight());
        //myCylinder.setradius(1376);
        System.out.println(myCylinder.getradius());
        
    }
    
}
