package StringManipulation;

public class MyStringManipulation {
    public static void main(String[] args) {
        String str = "I live in Dhaka";
        char[] a = str.toCharArray();
        for(int arr: a){
        }
        System.out.println(a);
        System.out.println("String length is : " + a.length + "\n");

        String str1 = "I live in Dhaka";
        char[] a1 = str1.toCharArray();
        for(int i = 0; i < a1.length; i++){
            System.out.println(a[i]);
        }

        //use charAt
        String str2 = "Hello Java";
        char c = str2.charAt(0);
        String d = String.valueOf(str2.charAt(0));
        System.out.println("\n" + c);
        System.out.println(d);

        //use indexOf
        System.out.println("\n" + str.indexOf('D'));

        //use contains
        System.out.println("\n");
        String strr = "Bangladesh is my country." +
                "Dhaka is the capital of Bangladesh";
        String city = "Dhaka";
        System.out.println(strr.contains(city));
        System.out.println(city.contains(strr));

        //use Equals
        System.out.println("\n");
        String city2 = "Dhaka";
        System.out.println(city.equals(city2));

        //String Replace
        System.out.println("\n");
        System.out.println(strr.replace("dhaka", "Rajshahi"));
        System.out.println(strr.replace("Dhaka", "Rajshahi"));

        //Use Concat
        System.out.println("\n");
        String str5 = "My name is Shovon. ";
        String str6 = "I am a student.";
        System.out.println(str5.concat(str6));

        //String Split
        System.out.println("\n");
        String str7 = "I am Shovon";
        String[] words = str7.split(" ");
        for (String s: words) {
            System.out.println(s);
        }

        //Use SubString
        String str8 = "I live in Mirpur city";
        String str9 = str8.substring(10,16);
        System.out.println(str9);
        String city3 = str.substring(str8.indexOf("Mi"),15);
        System.out.println(city3);
        String city4 = str8.substring(str8.indexOf("Mi"),str8.indexOf("ci"));
        System.out.println(city4);

        //String Upper Case
        //full string
        String str10 = "dhaka";
        System.out.println(str10.toUpperCase());
        //First word capital other is small
        String s1 = String.valueOf(str10.charAt(0)).toUpperCase();
        String s2 = str10.substring(1);
        System.out.println(s1+s2);

        //String Lower Case
        String s3 = "DHAKA";
        System.out.println(s3.toLowerCase());

        //trim a string
        String s4= " I am Shovon. I am a student.";
        System.out.println(s4.trim());

        //Split String 2
        String amount = "100.50";
        String[] amt = amount.split("\\.");
        String t= amt[0];
        int t1 = Integer.parseInt(t);
        String p = amt[1];
        int p1 = Integer.parseInt(p);
        System.out.println(t1);
        System.out.println(p1);

        //Split String 3
        String path = "O:\\My Files\\Road To SDET\\Batch-4\\Class 16 Java SE-4 (String Manipulation)";
        String projectName[] = path.split("\\\\");
        System.out.println(projectName[4]);

    }
}
