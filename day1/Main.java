import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short b = input.nextShort();
        float c = input.nextFloat();
        String name = input.next();
        double d = input.nextDouble();
        long e = input.nextLong();
        char name1 = input.next().charAt(0);

        System.out.println("the short is:" + b);
        System.out.println("the float is:" + c);
        System.out.println("the String is:" +name);
        System.out.println("the double is:" + d);
        System.out.println("the long is:" + e);
        System.out.println("the char is:" + name1);
    }
}