package day6;

public class Binaryno {
    public static void main(String[] arg) {
        for (int i = 1; i <=5; i++) {//row
            for (int j = 1; j <= i; j++) {//col
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}