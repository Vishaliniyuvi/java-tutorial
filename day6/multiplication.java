package day6;

public class multiplication{
    public static void main(String[] args){


        for(int i=1;i<=5;i++){//row
            for(int j=1;j<=5;j++){//col
                System.out.printf("%4d", i*j);//using c:print mul value
            }
            System.out.println();
        }
    }
}
