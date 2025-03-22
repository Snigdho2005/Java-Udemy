class StringPractice4
{
    public static void main(String[] args)
    {
        String str1 = "www.udemy.co.in";
        System.out.println(str1.indexOf('.'));
        System.out.println(str1.indexOf("udemy"));
        System.out.println(str1.indexOf(".",4));
        System.out.println(str1.lastIndexOf("."));
    }
}