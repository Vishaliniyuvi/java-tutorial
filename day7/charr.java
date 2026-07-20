package day7;

import java.util.Scanner;

public class charr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] name = new char[5];
        for (int i = 1; i < 5; i++) {
            char name1=sc.next().charAt(0);
            name[i] = name1;
        }
        for (char i : name) {
            System.out.println(name);
        }
    }
}