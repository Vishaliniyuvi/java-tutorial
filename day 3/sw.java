package day3;
import java.util.Scanner;

public class sw{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                if (a >=15) {
                    System.out.println("accept");
                } else {
                    System.out.println("denied");
                }
                break;
        case 2:
        System.out.println("hello");
        break;
        default:
            System.out.println("not taken");
        }
    }
}