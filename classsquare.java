class square{
    int area;
    int perimeter;
    public int area(int a){
         area=a*a;
        return area;

    }
    public int perimeter(int  a){
         perimeter=4*a;
       return perimeter;
    }
}
public class classsquare {
    public static void main(String[] args) {
        square circle=new square();
        System.out.println(circle.perimeter(4));

        System.out.println(circle.area(5));


        
    }
    
}
