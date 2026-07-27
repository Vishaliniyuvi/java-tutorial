package day13;
class car{
    void station(){
        System.out.println("Petrol Station");
    }
}
class EVCAR extends car{
    void station(){
        System.out.println("EV Station");
    }
}
class PETROLCAR extends car{
    void station(){
        System.out.println("Petrol Station is not working");
    }
}
public class polymorphism {
    public static void main(String[] args){
        EVCAR evcar=new EVCAR();
        evcar.station();
        PETROLCAR car=new PETROLCAR();
        car.station();
    }
}