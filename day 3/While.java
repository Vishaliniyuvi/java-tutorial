package day3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        while(num<20){
            System.out.println(num);
            num++;
        }
    }
}