package day5;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                System.out.println("Not an Automorphic Number");
                return;
            }

            temp = temp / 10;
            square = square / 10;
        }

        System.out.println("Automorphic Number");
    }
}