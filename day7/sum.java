package day7;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]id={1,4,5,3,8,7};
        int evensum=0;
        int oddsum=0;
        for(int num:id){
        if(num%2==0){
          evensum+=num;
        }else {
            oddsum+=num;
        }
        }
        System.out.println(evensum);
        System.out.println(oddsum);

    }
}
