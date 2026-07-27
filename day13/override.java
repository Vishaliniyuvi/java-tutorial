package day13;
class animal{
    void makeSound(){
        System.out.println("Sound made by animal");
    }
}
class dog extends animal{
    @Override
    void makeSound(){
        System.out.println("Sound made by dog");
    }
}
public class override {
    public static void main(String[] args){
        dog d=new dog();
        d.makeSound();
    }
}