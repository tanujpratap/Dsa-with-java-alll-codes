
class monkey{
    void bite(){
        System.out.println("jump..");

    }
    void jump(){

    }
    interface basicanimal{
        void eat();
        void love();
        
    }

}
class human extends monkey implements basicanimal{
    public void sleep(){
        System.out.println("i am sleepingh");
    }
    public void speak(){
        System.out.println("hello sir");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void love(){
        System.out.println("loving");
    }

}
public class monkey22 {
    public static void main(String[] args) {
        monkey m1=new human();
        m1.jump();
       basicanimal tanuj=new human();
       tanuj.eat();

        
    }
    
}
