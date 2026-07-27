package day13;
class L{
    L(){
        super();
        System.out.println("print the value L");
    }
    L(int a){
        this();
        System.out.println("print the value L "+a);
    }
}
class M extends L{
    M(){

    }
    M(int l,int m){

    }
    M(int l){
        this();
        System.out.println("print the value of M "+l);
    }
}
public class superclass {
    public static void main(String[] args){
        M m=new M(10);
    }
}