package day7;

import java.util.Scanner;

public class sum_evenorodd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]id={12,1,134,2001};
        int evensum=0;
        int oddsum=0;
        for(int num:id){
            int org=num;
            int count=0;
            while(num!=0){
                int pop=num%10;
                count+=pop;
                num/=10;
            }
            if(count%2==0){
                evensum+=org;
            }
            else{
                oddsum+=org;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}

