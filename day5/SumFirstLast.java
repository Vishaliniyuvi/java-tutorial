package day5;

import java.util.Scanner;

public class SumFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int last = n % 10;   // Last digit

        int first = n;
        while (first >= 10) {
            first = first / 10;
        }

        int sum = first + last;

        System.out.println("First digit = " + first);
        System.out.println("Last digit = " + last);
        System.out.println("Sum = " + sum);
    }
}