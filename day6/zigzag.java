package day6;

public class zigzag {
    public static void main(String[] args){
        for (int i = 1; i <=5; i++) {//outerloop
            int num = i;
            for (int j = 1; j <= i; j++) {//innerloop
                System.out.print(num + " ");
                num = num + 5 - j;
            }
            System.out.println();
        }
    }
}