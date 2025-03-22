import java.util.*;
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to find out Fibonacci Series");
        System.out.println("Enter number of Terms: ");
        int n = sc.nextInt();

        int a=0,b=1,c;

        System.out.println(a+","+b+",");
        for(int i=0; i<n-2; i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}
