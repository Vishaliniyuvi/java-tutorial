package day3;
import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String check = (a % 2 == 0) ? "even" : "odd";
        System.out.println(check);
    }
}