package day7;

import java.util.Scanner;

public class arr2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] id=new int[5];
        for(int i=0;i<5;i++){
            int a=sc.nextInt();
            id[i]=a;
        }
        System.out.println(id[3]);
    }
}
