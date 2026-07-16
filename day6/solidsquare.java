package day6;

public class solidsquare{
    public static void main(String[] args){
        int n=5;//n*n
        for(int i=0;i<n;i++){//outerloop
            for(int j=0;j<n;j++){//innerloop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
