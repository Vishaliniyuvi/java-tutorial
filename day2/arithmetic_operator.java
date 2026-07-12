package day2;
import java.util.Scanner;
public class arithmetic_operator{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = a + b;
            System.out.println("the addition is:"+d);
            int e =a-b;
            System.out.println("the sub is:"+e);
            int f =a%b;
            System.out.println("the modulo is:"+f);
            int g=a/b;
            System.out.println("the division is:"+g);
            int h=a*b;
            System.out.println("the multiplication is:"+h);
            int i=a++;
            System.out.println("the increment is:"+i);


    }
}
