package day13;
class P{
    void display(){
        System.out.println("Hello World");
    }
}
class Q extends P{
    void show(){
        System.out.println("Welcome to the show");
    }
}
class R extends Q{
    void fly(){
        System.out.println("Java Programming");
    }
}
public class multilevel {
    public static void main(String[] args){
        P p=new P();
        Q q=new Q();
        R r=new R();
        q.display();
        r.fly();
        r.show();
        r.display();
    }
}