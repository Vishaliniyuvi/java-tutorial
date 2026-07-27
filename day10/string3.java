package day10;
public class string3 {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("hello");
        StringBuilder name1 = new StringBuilder("hello");
        String name2 = name.toString();
        String name3 = name.toString();
        System.out.println(name2 == name2);
    }
}