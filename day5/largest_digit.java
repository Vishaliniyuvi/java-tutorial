package day5;

import java.util.Scanner;
public class largest_digit {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 0;
        while (num != 0) {
            int pop = num % 10;
            {
                if (pop > max) {
                    max = pop;
                }
                num = num / 10;
            }

        }
        System.out.println("the largest num:" + max);
    }
}