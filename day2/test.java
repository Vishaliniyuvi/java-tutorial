package day2;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner C=new Scanner(System.in);
        int tam=C.nextInt();
        int ece=C.nextInt();
        int cce=C.nextInt();
        int evs=C.nextInt();
        int beee=C.nextInt();
        float avg=(tam+ece+cce+evs+beee)/5;
        System.out.println("avg of five sub:"+avg);
    }
}
