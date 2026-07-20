package day7;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        int[] id = {2, 3, 4, 5, 6, 8, 9};
        int max = id[0];
        int min = id[0];
        for (int num : id) {
            if (num > max) {
                max = num;

            } else if (num < min) {
                min = num;
            }

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(max*min);
    }
}