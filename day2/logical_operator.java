package day2;

import java.util.Scanner;

public class logical_operator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean c=(a>5)&&(b<35);
        System.out.println(c);
        System.out.println(a>15 && b<35);
        System.out.println(a>5 || b<10);
        System.out.println(!(a>=6));
    }
}