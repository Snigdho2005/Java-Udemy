import java.util.*;
public class YoungorNotYoung {
    
    public static void main(String[] args)
    {
        int age;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Age :");
        age = sc.nextInt();

        if(age>=14 && age<=55)
        {
            System.out.println("You are Young");
        }
        else
        {
            System.out.println("You are Not Young");
        }
    }
}
