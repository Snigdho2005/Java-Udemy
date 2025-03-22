class StringPractice5
{
    public static void main(String[] args)
    {
        /* 
        String str1 = "Pyramid";
        String str2 = "Pyramid";
        System.out.println(str1.equals(str2));
        */

        /* 
        String str1 = "Pyramid";
        String str2 = "pyramid";
        System.out.println(str1.equalsIgnoreCase(str2));
        */
         
        /* 
        String str1 = "Pyramid";
        String str3 = new String("Pyramid");
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        */
        
        /* 
        String str1 = "china wall";
        String str3 = new String("pyramid");
        System.out.println(str1.compareTo(str3));
        */

        /*
        String str1 = "the great wall of china";
        System.out.println(str1.contains("wall"));
        */

        String str1 = "the great wall";
        String str2 = " of china";
        System.out.println(str1.concat(str2));
    
    }   
}