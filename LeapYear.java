import java.util.*;
public class LeapYear {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Year Number :");
        int year = sc.nextInt();
    
        if(year%4==0)
        {
            if(year%100==0)
            {
               if(year%400==0)
               {
                 System.out.println("Its a Leap Year");
               }
            }
            else
            {
                 System.out.println("It is not a Leap Year");
            }
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
