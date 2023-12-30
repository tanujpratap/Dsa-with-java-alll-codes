class employee{
    int sallery; 
    String name;
    public int getsallery(){
        return sallery;

    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;

    }
}
public class classemployee {
    public static void main(String[] args) {
        employee tanuj=new employee();
        tanuj.setname("tanuj pratap solanki");
        System.out.println(tanuj.getname());
        tanuj.sallery=12500;
        System.out.println(tanuj.getsallery());
        
    }
    
}
