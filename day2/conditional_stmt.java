package day2;

import java.util.Scanner;

public class conditional_stmt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%5==0){
            System.out.println("divisible by 5");
        }
        else
        {
            System.out.println("not divisibile by 5");
        }
    }
}