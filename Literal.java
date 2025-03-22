class Literal
{
    public static void main(String arg[])
    {
        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0XA;

        long l = 999999999999L;

        float f = 12.56F;
        double d = 12.56;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(l);

        System.out.println(f);
        System.out.println(d);
    }
}
