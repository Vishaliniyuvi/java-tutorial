package oops.day1;
class D{
    int id;
    String name;
    String name1;
    D(int id){
        this.id=id;
    }
    D(String name){
        this.name=name;
    }
    D(String name1,String name2){
        this.name1=name1;
        this.name=name2;
    }
    D(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id + " " + name + " ");
    }
}
public class oops4 {
    public static void main(String[] args){
        D obj=new D(100);
        D abc=new D("shaa");
        D efg=new D(30,"visha");
        efg.display();
    }
}