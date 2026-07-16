package day6;

public class rightaligned{
    public static void main(String[] args){
        int n=5; //n*n
        for(int i=0;i<=n;i++){//row
            for(int j=0;j<=n-i;j++){//col
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}