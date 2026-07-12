package day3;

import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            if (a == 2) {
                if (a == 4) {
                    System.out.println("eee");
                }
            } else if (a != b) {
                System.out.println("not equal");
            } else {
                System.out.println("yes");
            }
        }
    }
}