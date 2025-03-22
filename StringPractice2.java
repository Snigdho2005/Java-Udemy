class StringPractice2
{
    public static void main(String[] args)
    {
        /* 
        String str = new String("Netbeans");
        int len = str.length();
        System.out.println(len);

        String str1 = str.toUpperCase();
        System.out.println(str1);
        */

        /* 
        String str = new String("   Netbeans   ");
        System.out.println(str);
        str = str.trim();
        System.out.println(str); 
        */

        /* 
        String str = new String("netbeans");
        String str2 = str.substring(3,5);
        System.out.println(str2); 
        */

        String str = new String("netbeans");
        String str2 = str.replace('e','M');
        System.out.println(str2);
    }
}