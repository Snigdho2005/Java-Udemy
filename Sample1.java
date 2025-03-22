import java.util.*;

public class Sample1
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 2 Numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;

        System.out.println("Sum is : " + c);

        s.close();

    }
}
