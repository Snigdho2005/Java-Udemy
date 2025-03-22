import java.util.*;
public class DisplayDigits {
    
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a Number");
       int n = sc.nextInt();

       int r;

       while(n>0)
       {
          r=n%10;
          n=n/10;

          System.out.println(r);
       }
       System.out.println(n);
    }
}
