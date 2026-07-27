package oops.day1;
class C{
    int id;
    String name;
    C(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id + " " + name);
    }
}
public class oops3 {
    public static void main(String[] args){
        C obj=new C(10,"Shaaa");
        obj.display();
    }
}