package day4;

import java.util.Scanner;

public class zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0) {
            int pop = num % 10;
            if (pop == 0)
                System.out.println("the Num contains zero");
            num = num / 10;
        }
    }
}
