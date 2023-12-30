import java.util.jar.Manifest;

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
}
public class cylinderclass {
    public static void main(String[] args) {
        cylinder myCylinder=new cylinder();
        myCylinder.setheight(12);
        System.out.println(myCylinder.getheight());
        myCylinder.setradius(13);
        System.out.println(myCylinder.getradius());
        
    }
    
}
