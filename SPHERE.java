

class SPHERER{
    private int r;
    private int h;
    public void setheight(int h){
         this.h=h;
    }
    public float getvolume(){
    return (4/3)*r*r*r;
    }
    public float getsurfacearea(){
        return 4*3.14f*r*r;
    }
    public void setradius(int r){
        this.r=r;
    }
}
public class SPHERE {
    public static void main(String[] args) {
        SPHERER mysphere=new SPHERER();
        mysphere.setheight(12);
        mysphere.setradius(13);
        System.out.println(mysphere.getvolume());
        
        System.out.println(mysphere.getsurfacearea());
        
    }
    
}
