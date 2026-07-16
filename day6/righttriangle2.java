package day6;

public class righttriangle2{
    public static void main(String[] args){
        int n=5; //n*n
        for(int i=0;i<n;i++){//row
            for(int j=n;j>i;j--){//col
                System.out.print("*");
            }
            System.out.println();
        }
    }
}