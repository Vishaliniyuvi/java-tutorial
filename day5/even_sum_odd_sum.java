package day5;
import java.util.Scanner;
public class even_sum_odd_sum {
    public static void main(String[]args){
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int evensum=0;
        int oddsum=0;
        while(num!=0) {
            int pop = num % 10;
            {
                if (pop % 2 == 0) {
                    evensum += pop;
                } else {
                    oddsum += pop;
                }
                sum += pop;
                num = num / 10;
            }
        }
        System.out.println("enter sum:"+sum);
        System.out.println("enter evensum:"+evensum);
        System.out.println("enter oddsum:"+oddsum);

    }
}
