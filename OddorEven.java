import java.util.*;;
public class OddorEven {
    
    public static void main(String[] args)
    {
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        n = sc.nextInt();

        if(n%2==0)
        {
           System.out.println("It is an Even Number");
        }
        else
        {
            System.out.println("It is an Odd Number");
        }
    }

}
