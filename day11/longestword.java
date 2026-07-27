package day11;

public class longestword {
    public static void main(String[] args){
        String words="sreelakshmi,princy,roshini,zulu";
        String[] arr=words.split(",");
        for(String word:arr){
            System.out.println(words);
        }
        String longword=arr[0];
        for(String word:arr){
            if(word.length()>longword.length()){
                longword=word;
            }
        }
        System.out.println("Longest word : "+longword);
    }
}