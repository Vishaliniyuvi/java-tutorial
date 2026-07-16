package day6;

public class righttriangle1 {
    public static void main(String[] args){
        int n=5; //n*n
                for(int i=0;i<n;i++){//row
                    for(int j=0;j<=i;j++){//col
                        System.out.print("*");
                    }
                    System.out.println();
                }
    }
}
