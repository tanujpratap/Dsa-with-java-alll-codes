

class cylinder{
    private int r;
    private int h;
    public void setheight(int h){
         this.h=h;
    }
    public float getvolume(){
    return 3.14f*r*r*h;
    }
    public float getsurfacearea(){
        return 2*3.14f*r*h+2*3.14f*r*r;
    }
    public void setradius(int r){
        this.r=r;
    }
}
public class cylinder2 {
    public static void main(String[] args) {
        cylinder myCylinder=new cylinder();
        myCylinder.setheight(12);
        myCylinder.setradius(13);
        System.out.println(myCylinder.getvolume());
        
        System.out.println(myCylinder.getsurfacearea());
        
    }
    
}
