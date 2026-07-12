package day3;
import java.util.Scanner ;
public class oddno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        {
            for(a=1;a<21;a++)
                if(a%2!=0)
                    System.out.println(a);
        }
    }
}