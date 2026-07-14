package day5;
import java.util.Scanner;

public class RemoveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                result = result + digit * place;
                place = place * 10;
            }

            n = n / 10;
        }

        System.out.println("Number after removing zeros: " + result);
    }
}