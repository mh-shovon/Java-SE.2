package StringManipulation;

public class CountWord {
    public static void main(String[] args) {
        String str = "Java is a case sensitive language";
        System.out.println(str.length());
        String[] str1 = str.split(" ");
        System.out.println(str1.length);
    }
}
