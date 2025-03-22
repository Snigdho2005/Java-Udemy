public class Regex2 {
    
    public static void main(String[] args)
    {   
        /*
        String str1 = "abcccbaccba";
        System.out.println(str1.matches(".*"));
        System.out.println(str1.matches("[a-z]*"));
        System.out.println(str1.matches("[abc]*"));
        System.out.println(str1.matches("[abc]+"));
        */

        /*
        String str1 = "acc";
        System.out.println(str1.matches("[abc]{3}"));

        String str2 = "accb";
        System.out.println(str2.matches("[abc]{3,7}"));
        */

        String str3 = "john@gmail.com";
        System.out.println(str3.matches(".*gmail.*"));
        System.out.println(str3.matches("\\w+@gmail.*"));


    }
}
