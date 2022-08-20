package StringManipulation;

public class Exercise1 {
    public static void main(String[] args) {
        String str="bangladesh";
        int len = str.length();
        String firstLetter = String.valueOf(str.charAt(0)).toUpperCase();
        String lastLetter = String.valueOf(str.charAt(9)).toUpperCase();
        System.out.println(firstLetter+(len-2)+lastLetter);

    }

}
