package day13;
class A{
    void display(){
        System.out.println("Hello World");
    }
}
class B extends A{
    void show(){
        System.out.println("Welcome to the show");
    }
}
public class single_inheritance {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        b.show();
        b.display();
    }
}