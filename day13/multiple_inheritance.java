package day13;
class F{
    void display(){
        System.out.println("Hello World");
    }
}
class G extends F{
    void show(){
        System.out.println("Welcome to the show");
    }
}
class H extends F{
    void fly(){
        System.out.println("Java Programming");
    }
}
public class multiple_inheritance {
    public static void main(String[] args){
        F f=new F();
        G g=new G();
        H h=new H();
        g.show();
        g.display();
        h.fly();
    }
}