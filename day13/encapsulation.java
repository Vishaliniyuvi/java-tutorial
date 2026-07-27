package day13;
class S{
    private int a;
    private int b;
    private String name;
    S(int a,int b,String name){
        this.a=a;
        this.b=b;
        this.name=name;
    }
    void setID(int a,int b){
        this.a=a;
        this.b=b;
    }
    int getS(){
        return this.a;
    }
    int getT(){
        return this.b;
    }
    void display(){
        System.out.println(a+" "+b+" "+name);
    }
}
public class encapsulation {
    public static void main(String[] args){
        S s=new S(10,20,"Vishaa");
        s.display();
    }
}