package day6;

public class alphabet {
    public static void main(String[] args){
        char ch='Z';
        for(int i=1;i<=5;i++){//outerloop
            for(int j=1;j<=5;j++){//innerloop
                System.out.print(ch--);
            }
            System.out.println();
        }
    }
}

