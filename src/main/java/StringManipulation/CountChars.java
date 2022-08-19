package StringManipulation;

public class CountChars {
    public static void main(String[] args) {
        String str1 = "I am bangladeshi";
        int count=0;
        for(int i=0;i<=str1.length()-1;i++){
            if(str1.charAt(i) !=' '){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
