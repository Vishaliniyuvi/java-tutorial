package day5;

import java.util.Scanner;
public class smallest_digit {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int min = 9;
        while (num != 0) {
            int pop = num % 10;
            {
                if (pop < min) {
                    min = pop;
                }
                num = num / 10;
            }

        }
        System.out.println("the samllest num:" + min);
    }
}