package day14;
abstract class animal{
    abstract public void makesound();
    void makingsound(){
        System.out.println("making sound");
    }
}
class dog extends animal{
    @Override
    public void makesound(){
        System.out.println("bow bow");
    }
}
class cat extends animal{
    @Override
    public void makesound(){
        System.out.println("meow meow");
    }
}
public class abstraction {
    public static void main(String[] args){
        animal dog=new dog();
        dog.makesound();
        animal cat=new cat();
        cat.makesound();
        dog.makingsound();
    }
}